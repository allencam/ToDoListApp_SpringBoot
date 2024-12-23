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
    `profile_id`        INT NOT NULL AUTO_INCREMENT,
    `user_id`           INT NOT NULL,
    `first_name`        VARCHAR(50) NOT NULL,
    `last_name`         VARCHAR(50) NOT NULL,
    `image_url`         VARCHAR(200),

    PRIMARY KEY (`profile_id`),
    FOREIGN KEY (`user_id`) REFERENCES users (`user_id`) ON DELETE CASCADE
);

CREATE TABLE tasks (
    `task_id`           INT NOT NULL AUTO_INCREMENT,
    `user_id`           INT NOT NULL,
    `title`             VARCHAR(100) NOT NULL,
    `description`       VARCHAR(255),
    `priority`          INT NOT NULL,

    PRIMARY KEY (`task_id`),
    FOREIGN KEY (`user_id`) REFERENCES users (`user_id`) ON DELETE CASCADE
);

# ------------------------------- INSERT ------------------------------- #

-- Insert Users
INSERT INTO users (`username`, `hashed_password`, `role`) VALUES
    ('johndoe', 'password123', 'USER'),
    ('janedoe', 'password456', 'ADMIN'),
    ('bobsmith', 'password789', 'USER');

-- Insert Profiles
INSERT INTO profiles (`user_id`, `first_name`, `last_name`, `image_url`) VALUES
    (1, 'John', 'Doe', 'https://example.com/johndoe.jpg'),
    (2, 'Jane', 'Doe', 'https://example.com/janedoe.jpg'),
    (3, 'Bob', 'Smith', 'https://example.com/bobsmith.jpg');

-- Insert Tasks
INSERT INTO tasks (`user_id`, `title`, `description`, `priority`) VALUES
    (1, 'Complete Homework', 'Finish math homework by 5 PM', 2),
    (1, 'Grocery Shopping', 'Buy milk, eggs, and bread', 1),
    (1, 'Gym Workout', 'Leg day workout', 3),
    (1, 'Call Plumber', 'Fix the leaking faucet', 2),
    (2, 'Prepare Presentation', 'Finish slides for project meeting', 3),
    (2, 'Submit Expense Report', 'Submit Q3 expense report to HR', 2),
    (2, 'Team Meeting', 'Attend team sync-up at 10 AM', 1),
    (3, 'Plan Vacation', 'Research places to visit in Europe', 3),
    (3, 'Fix Laptop', 'Repair the broken screen', 2),
    (3, 'Buy Groceries', 'Purchase fruits and vegetables', 1),
    (3, 'Dentist Appointment', 'Teeth cleaning appointment at 3 PM', 2),
    (3, 'Weekly Cleanup', 'Clean the house and do laundry', 1),
    (2, 'Interview Candidate', 'Technical interview with Jane Smith', 3),
    (1, 'Read Book', 'Read 50 pages of "Atomic Habits"', 2),
    (3, 'Car Service', 'Oil change and general inspection', 2),
    (2, 'Update Software', 'Update project management tools', 1),
    (1, 'Attend Webinar', 'Webinar on Java Spring Boot best practices', 2);