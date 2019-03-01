<?php
$data = json_decode(file_get_contents("php://input"));
include "db.php";
// $sql = "INSERT INTO eventDetails (title, type, host, phone, location, address, city, message, date)
// VALUES ('$data->title', '$data->type', '$data->host', '$data->phone', '$data->location', '$data->address', '$data->city', '$data->message','$data->date')";

$sql = "INSERT INTO eventType (name, cost) VALUES('$data->name', '$data->cost')";
if($data->name){
	$qry = $conn->query($sql);
}
$conn->close();
?>
