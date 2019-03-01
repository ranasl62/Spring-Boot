<?php
$data = json_decode(file_get_contents("php://input"));
include "db.php";

$sql = "INSERT INTO venuebook (venueName, eventName, date)
VALUES ('$data->venueName', '$data->eventName', '$data->date')";

// $sql = "SELECT * FROM venuebook WHERE date = '$data->date'
// INSERT INTO venuebook (venueName, eventName, date)
// VALUES ('$data->venueName', '$data->eventName', '$data->date')
// ";

if($data->venueName){
	$qry = $conn->query($sql);
}
$conn->close();
?>
