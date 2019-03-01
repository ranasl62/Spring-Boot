<?php
$data = json_decode(file_get_contents("php://input"));
include "db.php";
$sql = "UPDATE eventDetails SET
title ='$data->title',  type ='$data->type',
host ='$data->host', phone ='$data->phone', location ='$data->location',
address ='$data->address', city ='$data->city', message ='$data->message', date_time ='$data->date_time'
WHERE id = $data->id";
$qry = $conn->query($sql);
if($data->title){
}
$conn->close();
?>
