<?php 
require_once 'koneksi.php';

$idFakultas = $_POST['id_fakultas'];

if (!$idFakultas) {
	echo json_encode(array('message'=>'fakultas data sukses dihapus'));
}else{
	echo json_encode(array('message'=>'fakutas data gagal dihapus'));
}
?>