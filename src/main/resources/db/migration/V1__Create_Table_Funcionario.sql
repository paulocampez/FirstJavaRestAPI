CREATE TABLE `funcionario` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cargo` varchar(255) NOT NULL,
  `cpf` varchar(255) NOT NULL,
  `data_cad` datetime NOT NULL,
  `nome` varchar(255) NOT NULL,
  `salario` double NOT NULL,
  `status` varchar(255) NOT NULL,
  `uf_nasc` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=508 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
