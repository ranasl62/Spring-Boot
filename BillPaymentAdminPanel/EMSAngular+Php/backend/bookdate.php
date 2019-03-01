<?php
$data = json_decode(file_get_contents("php://input"));
include "db.php";

$sql = "SELECT * FROM venuebook WHERE date = '$data->date'";

$result = $conn->query($sql);
$data = array() ;
if ($result->num_rows > 0) {
    // output data of each row

    while($row = $result->fetch_assoc()) {
        $data[] = $row;
    }
 } //else {
//     echo "0 results";
// }
 echo json_encode($data);
$conn->close();
?>
