<?php
$data = json_decode(file_get_contents("php://input"));
include "db.php";
$sql = "INSERT INTO eventbook (venueName, eventName, guest, host, phone, date)
VALUES ('$data->venueName', '$data->eventName', '$data->guest', '$data->host', '$data->phone', '$data->date')";
if($data->venueName){
	$qry = $conn->query($sql);
}
$conn->close();
?>
