
<section>
    <div class="jumbotron">
        <div class="container">
            <h3>Users</h3>
            <p>Current users</p>
        </div>
        <button class="btn btn-sm btn-default pull-right" data-toggle="modal" data-target="#userModal">Add User</button>
    </div>
</section>
<table class="table table-striped">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">Name</th>
        <th scope="col">Status</th>
        <th scope="col">Created On</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="users" var="user">
        <tr>
            <th scope="row"></th>
            <td>${user.firstName} ${user.lastName}</td>
            <td>${user.status}</td>
            <td>${user.dateCreated}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<!-- Modal -->
<div class="modal fade" id="userModal" tabindex="-1" role="dialog" aria-labelledby="userModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                ...
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Save changes</button>
            </div>
        </div>
    </div>
</div>