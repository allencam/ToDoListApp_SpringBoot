DROP DATABASE IF EXISTS todo_db;
CREATE DATABASE IF NOT EXISTS todo_db;
use todo_db;

# ------------------------------- TABLES ------------------------------- #

CREATE TABLE users (
    `user_id`           INT NOT NULL AUTO_INCREMENT,
    `username`          VARCHAR(50),
    `hashed_password`   VARCHAR(255) NOT NULL,
    `role`              VARCHAR(50),

    PRIMARY KEY (`user_id`)
);

CREATE TABLE profiles (
    `user_id`           INT NOT NULL,
    `first_name`        VARCHAR(50),
    `last_name`         VARCHAR(50),
    `image_url`         VARCHAR(200),

    PRIMARY KEY (`user_id`),
    FOREIGN KEY (`user_id`) REFERENCES users (user_id)
);

CREATE TABLE tasks (
    `task_id`           INT NOT NULL AUTO_INCREMENT,
    `user_id`           INT NOT NULL,
    `title`             VARCHAR(100) NOT NULL,
    `description`       VARCHAR(255),
    `priority`          INT NOT NULL,

    PRIMARY KEY (`task_id`),
    FOREIGN KEY (`user_id`) REFERENCES users (`user_id`)
);

# ------------------------------- INSERT ------------------------------- #

-- Insert sample users
INSERT INTO users (username, hashed_password, role) VALUES
('john_doe', '$2a$10$E6N3/U9FvrZCfG7UpbsnaO.Zk0q4jWoxydXU5cmX8NpQ8wGzQ.CPm', 'USER'), -- Password: password123
('jane_admin', '$2a$10$0lKfrtO9GxRApCtldHjepuOy99KEaUvEXGZph5K7fi12/LAb.I8ru', 'ADMIN'); -- Password: admin123

-- Insert sample profiles
INSERT INTO profiles (user_id, first_name, last_name, image_url) VALUES
(1, 'John', 'Doe', 'https://example.com/john_doe.jpg'),
(2, 'Jane', 'Admin', 'https://example.com/jane_admin.jpg');

-- Insert sample tasks
INSERT INTO tasks (user_id, title, description, priority) VALUES
(1, 'Buy groceries', 'Milk, eggs, and bread', 1),
(1, 'Workout', '1-hour cardio session', 2),
(2, 'Prepare report', 'Complete the monthly sales report', 1),
(2, 'Team meeting', 'Discuss project updates', 2);
