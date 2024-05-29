CREATE DATABASE risk_prevention;
USE risk_prevention;

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    rut VARCHAR(12) NOT NULL UNIQUE,
    nombre VARCHAR(100) NOT NULL,
    clave VARCHAR(100) NOT NULL,
    perfil ENUM('Cliente', 'Administrativo', 'Profesional') NOT NULL
);

CREATE TABLE capacitaciones (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tema VARCHAR(100) NOT NULL,
    descripcion TEXT,
    fecha DATE,
    cliente_id INT,
    FOREIGN KEY (cliente_id) REFERENCES usuarios(id)
);

CREATE TABLE visitas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fecha DATE NOT NULL,
    cliente_id INT,
    profesional_id INT,
    FOREIGN KEY (cliente_id) REFERENCES usuarios(id),
    FOREIGN KEY (profesional_id) REFERENCES usuarios(id)
);

CREATE TABLE listar_capacitaciones (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tema VARCHAR(100) NOT NULL,
    descripcion TEXT,
    fecha DATE,
    cliente_id INT,
    FOREIGN KEY (cliente_id) REFERENCES usuarios(id)
);
-- Insertar datos en la tabla usuarios
INSERT INTO usuarios (rut, nombre, clave, perfil) VALUES 
('12345678-9', 'Juan Perez', 'clave123', 'Cliente'),
('98765432-1', 'Maria Gonzalez', 'clave456', 'Cliente'),
('11223344-5', 'Carlos Lopez', 'clave789', 'Administrativo'),
('55667788-9', 'Laura Fernandez', 'clave321', 'Profesional'),
('99887766-5', 'Ana Ramirez', 'clave654', 'Profesional');

-- Insertar datos en la tabla capacitaciones
INSERT INTO capacitaciones (tema, descripcion, fecha, cliente_id) VALUES 
('Seguridad en el trabajo', 'Capacitación sobre medidas de seguridad en el lugar de trabajo.', '2024-06-01', 1),
('Primeros Auxilios', 'Capacitación sobre técnicas de primeros auxilios.', '2024-06-15', 2),
('Uso de EPP', 'Capacitación sobre el uso adecuado de equipos de protección personal.', '2024-07-01', 1);

-- Insertar datos en la tabla visitas
INSERT INTO visitas (fecha, cliente_id, profesional_id) VALUES 
('2024-06-05', 1, 4),
('2024-06-10', 2, 5),
('2024-07-05', 1, 5);