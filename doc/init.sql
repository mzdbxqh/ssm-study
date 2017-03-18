#create database ssm_study;
--drop table blog_posts;
CREATE TABLE IF NOT EXISTS `blog_posts` (
  `post_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `author_id` bigint(20) unsigned NOT NULL DEFAULT '0',
  `post_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `post_content` longtext NOT NULL,
  `post_title` text NOT NULL,
  `post_status` varchar(20) NOT NULL DEFAULT 'publish',
  `post_modified` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`post_id`),
  KEY `author_id` (`author_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;
INSERT INTO blog_posts (
  author_id,
  post_date,
  post_content,
  post_title,
  post_status,
  post_modified
) VALUES (
  1,
  now(),
  "正文内容啊内容",
  "标题啊标题",
  1,
  now()
)
