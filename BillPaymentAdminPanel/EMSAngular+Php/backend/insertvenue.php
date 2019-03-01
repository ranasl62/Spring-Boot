<?php
$data = json_decode(file_get_contents("php://input"));
include "db.php";
$sql = "INSERT INTO venue (type, name, cost)
VALUES ('$data->type', '$data->name', '$data->cost')";
if($data->type){
	$qry = $conn->query($sql);
}
$conn->close();
?>
