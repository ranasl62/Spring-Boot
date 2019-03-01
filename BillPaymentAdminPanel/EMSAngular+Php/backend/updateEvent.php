<?php
$data = json_decode(file_get_contents("php://input"));
include "db.php";
$sql = "UPDATE eventType SET
name ='$data->name',  cost ='$data->cost'
WHERE id = $data->id";
$qry = $conn->query($sql);
if($data->name){
}
$conn->close();
?>
