INSERT INTO GROUP_GENDER (group_gender_idx, name) values
 (1, '남자'),
 (2, '여자');

INSERT INTO IDOL_GROUP (group_gender_id, name) values
 (1, '방탄소년단'),
 (1, '엑소'),
 (2, '블랙핑크'),
 (2, '뉴진스');

INSERT INTO BOARD (name, type) values
 ('익명게시판', 'ANONYMOUS'),
 ('공지사항', 'NOTICE'),
 ('공지사항', 'NOTICE'),
 ('공지사항', 'NOTICE'),
 ('공지사항', 'NOTICE'),
 ('정국', 'GENERAL'),
 ('뷔', 'GENERAL'),
 ('첸', 'GENERAL'),
 ('지수', 'GENERAL'),
 ('리사', 'GENERAL'),
 ('하니', 'GENERAL');

INSERT INTO GROUP_BOARD(board_id, idol_group_id, board_name) values
 (2, 1, '공지사항'),
 (3, 2, '공지사항'),
 (4, 3, '공지사항'),
 (5, 4, '공지사항'),
 (6, 1, '정국'),
 (7, 1, '뷔'),
 (8, 2, '첸'),
 (1, 2, '익명 게시판'),
 (9, 3, '지수'),
 (10, 3, '리사'),
 (1, 3, '익명 게시판'),
 (11, 4, '하니');