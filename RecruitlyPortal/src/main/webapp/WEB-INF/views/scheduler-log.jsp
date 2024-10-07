<html>
<body>
<h2>Scheduler Logs</h2>
<table>
    <tr>
        <th>Timestamp</th>
        <th>Task</th>
    </tr>
    <c:forEach var="log" items="${logs}">
        <tr>
            <td>${log.timestamp}</td>
            <td>${log.task}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
