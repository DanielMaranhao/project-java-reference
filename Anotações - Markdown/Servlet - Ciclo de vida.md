# Servlet - Ciclo de vida

Cenário de ciclo de vida de um servlet (Wikipedia)

1. Assume that a user requests to visit a URL.
	- The browser then generates an HTTP request for this URL.
	- This request is then sent to the appropriate server.
2. The HTTP request is received by the web server and forwarded to the servlet container.
	- The container maps this request to a particular servlet.
	- The servlet is dynamically retrieved and loaded into the address space of the container.
3. The container invokes the `init()` method of the servlet.
	- This method is invoked only when the servlet is first loaded into memory.
	- It is possible to pass initialization parameters to the servlet so that it may configure itself.
4. The container invokes the `service()` method of the servlet.
	- This method is called to process the HTTP request.
	- The servlet may read data that has been provided in the HTTP request.
	- The servlet may also formulate an HTTP response for the client.
5. The servlet remains in the container's address space and is available to process any other HTTP requests received from clients.
	- The `service()` method is called for each HTTP request.
6. The container may, at some point, decide to unload the servlet from its memory.
	- The algorithms by which this decision is made are specific to each container.
7. The container calls the servlet's `destroy()` method to relinquish any resources such as file handles that are allocated for the servlet; important data may be saved to a persistent store.
8. The memory allocated for the servlet and its objects can then be garbage collected.