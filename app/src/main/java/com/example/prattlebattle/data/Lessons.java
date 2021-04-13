package com.example.prattlebattle.data;

import com.example.prattlebattle.R;
import com.example.prattlebattle.model.Lesson;
import com.example.prattlebattle.model.LessonSegment;

public class Lessons {

    private final static Lesson lesson1 = new Lesson(1, "Lesson 1: Introduction to basic communication skills",
            new LessonSegment[]{
                    new LessonSegment(1, "In this first lesson we will just touch upon some of the basic info about communication without going into detail", R.raw.a1),
                    new LessonSegment(2, " Verbal or oral communication occurs when we engage in speaking with others.", R.raw.a2),
                    new LessonSegment(3, "Although listening is considered a type of communication on its own, it can never exist as a “stand-alone” since effective communication requires both parties to participate in the conversation. That’s why we consider listening and verbal communication indispensable.",  R.raw.a3),
                    new LessonSegment(4, " What we do while we speak often says more than the actual words. Non-verbal communication includes facial expressions, posture, eye contact, hand movements, and touch.",  R.raw.a4),
                    new LessonSegment(5, " Whether it is an email, a memo, a report, a Facebook post, a Tweet, a contract, etc. all forms of written communication have the same goal to disseminate information in a clear and concise manner.",  R.raw.a1),
                    new LessonSegment(6, " Visual communication is the use of visual elements such as signs, typography, drawing, graphic design, illustration, industrial design, advertisement, animation, and electronic tools to communicate ideas and information.",  R.raw.a1),
                    new LessonSegment(7, " We communicate continually throughout each and every day. We do it without thinking – we operate on communication autopilot. However, it is encourageable for you to think about how you communicate with others. What is your preferred method of verbal communication?",  R.raw.a1),
                    new LessonSegment(8, " What nonverbal cues do you use when you are disinterested? Excited? Jittery? Are you an attentive listener? Can you write a succinct and well-articulated message? Are there barriers to how you communicate effectively?",  R.raw.a1),
                    new LessonSegment(4, " Let’s begin a journey to find the answers to all of those questions! Understanding how you communicate is the first step to communicating more effectively.",  R.raw.a1),
            }
    );

    private final static Lesson lesson2 = new Lesson(2, "Lesson 2: Types of listening to focus on",
            new LessonSegment[]{
                    new LessonSegment(1, "Most people take listening for granted; it's something that just happens to them. It is only when you take the time to consider what listening entails that you realize that it is a vital skill that should be nurtured and developed.", R.raw.a1),
                    new LessonSegment(2, " Perhaps the most important interpersonal skill is listening. Effective listening is often the basis of good personal relationships, whether at home, socially, in education, or at work. Receiving, constructing meaning from, and reacting to spoken and/or nonverbal messages is the act of listening.", R.raw.a1),
                    new LessonSegment(3, "Ignoring - the worst kind. Doesn’t even involve listening.",  R.raw.a1),
                    new LessonSegment(4, " Pretending - acting as if you are listening but actually paying attention to something else. Certainly not an effective type of listening as it still makes the other party feel ignored.",  R.raw.a1),
            }
    );

    public final static Lesson[] lessons = {lesson1, lesson2};
}
