insert into technologies (id, color, icon_file_name, "name") values
  (1, '#303030', 'pocketbase.svg', 'PocketBase'),
  (2, '#3ecf8e', 'supabase.svg', 'Supabase'),
  (3, '#336691', 'postgresql.svg', 'PostgreSQL'),
  (4, '#57ac4f', 'mongodb.svg', 'MongoDB'),
  (5, '#5baf42', 'spring.svg', 'Spring'),
  (6, '#E0234E', 'nestjs.svg', 'NestJS'),
  (7, '#c3002f', 'angular.svg', 'Angular');


-- Projet 1 : Budget Analytics
insert into projects (id, description, github, sort_order, status, title, url)
values (
  1,
  'C''est une application web permettante d''entrer les dépenses et les entrées d''argent et en voir les statistiques afin de mieux gérer son budget.',
  '',
  1,
  'ONLINE',
  'Budget Analytics',
  'https://budgetanalytics.app/'
);

insert into project_technology (project_id, technology_id) values
  (1, 7),  -- Angular
  (1, 1);  -- PocketBase


-- Projet 2 : DataSet
insert into projects (id, description, github, sort_order, status, title, url)
values (
  2,
  'Stockage de données complètement personnalisées et en masse. On peut accéder au donnée autant par une interface qu''une API complètement documentée.',
  '',
  2,
  'ARCHIVED',
  'DataSet',
  ''
);

insert into project_technology (project_id, technology_id) values
  (2, 7),  -- Angular
  (2, 3),  -- PostgreSQL
  (2, 5);  -- Spring


-- Projet 3 : TopSeries
insert into projects (id, description, github, sort_order, status, title, url)
values (
  3,
  'Faites votre Top personnel de vos séries préférées !',
  '',
  3,
  'OFFLINE',
  'TopSeries',
  'https://topseries.oscarprince.ch'
);

insert into project_technology (project_id, technology_id) values
  (3, 7),  -- Angular
  (3, 2);  -- Supabase


-- Projet 4 : Publissue
insert into projects (id, description, github, sort_order, status, title, url)
values (
  4,
  'Publissue est une application permettant de gérer les tâches de ses projets de manière simple, concise et sur un logiciel open-source. Le prix serait abordable ou voir gratuit si l''utilisateur veut mettre on-premise le logiciel.',
  '',
  4,
  'ARCHIVED',
  'Publissue',
  ''
);

insert into project_technology (project_id, technology_id) values
  (4, 7),  -- Angular
  (4, 4),  -- MongoDB
  (4, 6);  -- NestJS


-- Projet 5 : OneADay
insert into projects (id, description, github, sort_order, status, title, url)
values (
  5,
  'Le but du projet était de proposer une alternative simple à Instagram. L''utilisateur pouvait seulement poster une photo par jour et pouvait voir dans un feed toutes les autres photos de leur amis. Objectif : être plus réel sur les photos qu''on poste car grâce à un système de "streak", l''utilisateur était encouragé à poster au moins une photo tous les jours pour garder son avancée. Ça permet aux utilisateurs d''être plus authentique dans leur poste.',
  '',
  5,
  'ARCHIVED',
  'OneADay',
  ''
);

insert into project_technology (project_id, technology_id) values
  (5, 7),  -- Angular
  (5, 6),  -- NestJS
  (5, 3);  -- PostgreSQL

commit;
