<?php 
$con = mysqli_connect("localhost", "root", "", "universitas_kotlin");

if (mysqli_connect_error()) {
 	echo "gagal koneksi ke database".mysqli_connect_error();
 } 
 ?>