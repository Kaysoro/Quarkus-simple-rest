INSERT INTO card(id, name, url, gold, cost) VALUES (1, 'Energy', 'http://energy.com', 1, 0);
INSERT INTO card(id, name, url, gold, cost) VALUES (2, 'Treasure', 'http://treasure.com', 20, 5);

INSERT INTO deck(id, name) VALUES (1, 'DEFAULT');

INSERT INTO deck_card(deck_id, cards_id) VALUES (1, 1);
INSERT INTO deck_card(deck_id, cards_id) VALUES (1, 2);