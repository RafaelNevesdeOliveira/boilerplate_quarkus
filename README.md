# boilerplate-quarkus

Quarkus 3.40.1.1 em JVM 25.

## Subir com H2

```shell
./mvnw quarkus:dev
```

- `GET http://localhost:8080/usuarios`
- Swagger: `http://localhost:8080/q/swagger-ui`
- Dados no Dev UI: `http://localhost:8080/q/dev-ui` → Datasource → tabela `usuario`
- Arquivo do banco: `data/boilerplate.mv.db`
- JDBC: `jdbc:h2:file:./data/boilerplate;AUTO_SERVER=TRUE;DB_CLOSE_DELAY=-1`
- Usuário `sa`, senha `sa`

O schema é recriado a cada start e o `import.sql` carrega três usuários.

## SQL Server

O driver JDBC e o Agroal já estão no projeto. Suba com o profile `sqlserver` e aponte para a instância:

```shell
MSSQL_HOST=localhost \
MSSQL_PORT=1433 \
MSSQL_DATABASE=boilerplate \
MSSQL_USER=sa \
MSSQL_PASSWORD=Your_password123 \
./mvnw quarkus:dev -Dquarkus.profile=sqlserver
```

Nesse profile o Hibernate só atualiza o schema. O `import.sql` não roda.
