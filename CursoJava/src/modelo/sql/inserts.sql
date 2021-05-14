/*
INSERT INTO figura (fig_tipo, fig_nombre, fig_lado) VALUES (1, "cua1", 10);
INSERT INTO figura (fig_tipo, fig_nombre, fig_radio) VALUES (2, "cir1", 10);
INSERT INTO figura (fig_tipo, fig_nombre, fig_base, fig_altura) VALUES (3, "rect1", 12.3, 8.4);
INSERT INTO figura (fig_tipo, fig_nombre, fig_base, fig_altura) VALUES (4, "triangulo1", 10.0, 8.4);
INSERT INTO figura (fig_tipo, fig_nombre, fig_lado, fig_apotema, fig_lados) VALUES (5, "polig1", 10.0, 6.2, 6);
*/

SELECT * FROM figura where fig_tipo = 2; 