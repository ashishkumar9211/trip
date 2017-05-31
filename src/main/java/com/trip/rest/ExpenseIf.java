package com.trip.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.trip.dto.ExpenseTO;

@Path("/expense")
public interface ExpenseIf {

	@GET
	@Path("/")
	@Produces({MediaType.APPLICATION_JSON})
	public List<ExpenseTO> getExpenseDetails(@QueryParam("type") String type);
	
	@GET
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public ExpenseTO getExpenseById(@PathParam("id") int id);

	@POST
	@Path("/")
	@Produces({MediaType.APPLICATION_JSON})
	public Response addExpense( ExpenseTO empTo);

	@PUT
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public Response updateExpense(ExpenseTO sm, @PathParam("id") int id);

	@DELETE
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_JSON})
	public Response deleteExpense(@PathParam("id") int id);
	
	
	
	
	
}
