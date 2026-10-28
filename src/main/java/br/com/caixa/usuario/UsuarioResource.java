package br.com.caixa.usuario;

import io.quarkus.panache.common.Sort;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/usuarios")
public class UsuarioResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuario> listar() {
        return Usuario.listAll(Sort.ascending("id"));
    }
}
