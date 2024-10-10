# Use uma imagem base do Maven para construir o projeto
FROM maven:3.8.1-jdk-11 AS build
WORKDIR /app

# Copia o arquivo pom.xml e as dependências para o container
COPY pom.xml ./
RUN mvn dependency:go-offline -B

# Copia o restante do código fonte para o container
COPY src ./src

# Compila o projeto
RUN mvn package -DskipTests

# Segunda etapa: rodando a aplicação
FROM openjdk:11-jre-slim
WORKDIR /app

# Copia o arquivo .jar da etapa de build para o container final
COPY --from=build /app/target/*.jar ./app.jar

# Expõe a porta 8080 (porta padrão do Spring Boot)
EXPOSE 8080

# Comando para rodar o aplicativo
CMD ["java", "-jar", "app.jar"]
