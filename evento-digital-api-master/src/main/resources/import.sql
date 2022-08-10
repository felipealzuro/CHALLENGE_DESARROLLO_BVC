INSERT INTO evento(id_evento, descripcion, valor_unitario) VALUES('F001', 'Consulta de información bursátil', 20.5);
INSERT INTO evento(id_evento, descripcion, valor_unitario) VALUES('F002', 'Emisión de título valor', 200);
INSERT INTO evento(id_evento, descripcion, valor_unitario) VALUES('F003', 'Generación de reportes operativos', 55.9);
INSERT INTO evento(id_evento, descripcion, valor_unitario) VALUES('F004', 'Custodia de título valor', 100);
INSERT INTO evento(id_evento, descripcion, valor_unitario) VALUES('F005', 'Complementación de operación', 32);

INSERT INTO registro_evento(plataforma, id_evento, fecha_evento, costo_evento, numero_eventos) VALUES('PACTO', 'F005', '2022-09-30', 400, 2); 
INSERT INTO registro_evento(plataforma, id_evento, fecha_evento, costo_evento, numero_eventos) VALUES('PACTO', 'F003', '2022-09-30', 400, 2);
INSERT INTO registro_evento(plataforma, id_evento, fecha_evento, costo_evento, numero_eventos) VALUES('DEPO', 'F001', '2022-09-30', 400, 2);
INSERT INTO registro_evento(plataforma, id_evento, fecha_evento, costo_evento, numero_eventos) VALUES('BAKO', 'F002', '2022-09-30', 400, 2);
INSERT INTO registro_evento(plataforma, id_evento, fecha_evento, costo_evento, numero_eventos) VALUES('BAKO', 'F005', '2022-09-30', 400, 2);
INSERT INTO registro_evento(plataforma, id_evento, fecha_evento, costo_evento, numero_eventos) VALUES('PLATGI', 'F002', '2022-09-30', 400, 2);
INSERT INTO registro_evento(plataforma, id_evento, fecha_evento, costo_evento, numero_eventos) VALUES('PLATGI', 'F003', '2022-09-30', 400, 2);