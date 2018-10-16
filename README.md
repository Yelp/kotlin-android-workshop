This repository hosts the coding exercises from a Kotlin Workshop for Android. Basic knowledge of both Android and Java is assumed for anyone participating in this workshop. No prior knowledge of Kotlin is required; the linked presentations, videos, and workbook start from very basic syntax in Kotlin and build from there.

The linked presentations and videos are from a recording of a live event held internally at Yelp on May 24th, 2018, and may already be out of date. If a new event is held, this repository and its recordings may be updated. Otherwise, any updates are rather unlikely.

## Format of this Repository

There are a total of 7 apps in this repository. If you follow along with the workshop, you can start from the folder `app` and build your Android app by following the instructions in the video and workbook. If you struggle to complete an exercise, you can simply look in the folder with the corresponding number. For example, `app4` contains the Android app that is the result of completing exercises 1-4. Alternatively, if you’re interested in completing, for example, only sessions 3 and 6, you can start from `app2` to complete the exercises in session 3, and then start from `app5` to complete the exercises in session 6.

## Format of the Workshop

The workshop was intended as a one-day event. It was split into sessions of about 1 hour each. Each session roughly consisted of a 20-minute presentation, followed by a 20-minute live coding session, and finally, a 20-minute attendee coding session on a topic relevant to the presentation. Presenters were available during the coding sessions to answer questions or troubleshoot any issues. By the end of the day, we built a simple app that displayed a list of businesses using Yelp's public API.

Here’s a [workbook][workbook] with more detailed information on the topic, and below is a list of all sessions and a brief summary of their content.

## Syllabus

1. Basic Syntax and Types - how to create classes, interfaces, and functions. At the end you should be able to write a very simple Kotiln class ([presentation][prezi1], [video][video1])

2. Constructors and Control Flow - difference between statements and expressions, conditional statements and loops, jumps and qualifiers, primary and secondary constructors, and execution flow when constructing instances ([presentation][prezi2], [video][video2])

3. Functions - operators, inlining, a little bit about generics, named parameters, lambdas and closures, obtaining references to functions and passing them to other functions, and higher-order functions ([presentation][prezi3], [video][video3])

4. Properties and Nullability - java interop, synthetic and delegated properties, custom setters and getters, lateinit, ​nullable and non-null properties, and optional invocation ([presentation][prezi4], [video][video4])

5. Useful Kotlin Standard Functions - introduction to `use`, `let`, `apply`, `also`, `with`, `isEmpty`, `orEmpty`, and more, as well as how and when to use them ([presentation][prezi5], [video][video5])

6. Kotlin's Collections APIs - mapping, transforming, filtering, aggregating, and associating anything you can iterate over like a boss ([presentation][prezi6], [video][video6])

7. How to Build DSLs - what they’re useful for and how to build them ([presentation][prezi7], [video][video7])

All presentations, videos, and the workbook are shared as is in a publicly accessible Google Drive folder. If you'd rather download them and go over them at your own pace, here’s a [link to the folder][folder with materials].

## License

This Kotlin Workshop exercise repository is licensed under the Apache License, Version 2.0: http://www.apache.org/licenses/LICENSE-2.0

[workbook]: https://goo.gl/qUG3es  "Kotlin for Android - Workbook"
[prezi1]: https://goo.gl/yVa19y "Kotlin for Android - Part 1 - Basics (Presentation)"
[video1]: https://goo.gl/TodGcs "Kotlin for Android - Part 1 - Basics (Video)"
[prezi2]: https://goo.gl/E5VYra "Kotlin for Android - Part 2 - Constructors and Control Flow (Presentation)"
[video2]: https://goo.gl/SYNhgM "Kotlin for Android - Part 2 - Constructors and Control Flow (Video)"
[prezi3]: https://goo.gl/VnANmU "Kotlin for Android - Part 3 - Functions (Presentation)"
[video3]: https://goo.gl/uexeNe "Kotlin for Android - Part 3 - Functions (Video)"
[prezi4]: https://goo.gl/vHwgi2 "Kotlin for Android - Part 4 - Properties (Presentation)"
[video4]: https://goo.gl/fxdxro "Kotlin for Android - Part 4 - Properties (Video)"
[prezi5]: https://goo.gl/11UiT1 "Kotlin for Android - Part 5 - std-lib (Presentation)"
[video5]: https://goo.gl/T5RrcZ "Kotlin for Android - Part 5 - std-lib (Video)"
[prezi6]: https://goo.gl/sfvYPh "Kotlin for Android - Part 6 - Collections (Presentation)"
[video6]: https://goo.gl/DoWYj8 "Kotlin for Android - Part 6 - Collections (Video)"
[prezi7]: https://goo.gl/77Zup1 "Kotlin for Android - Part 7 - DSLs (Presentation)"
[video7]: https://goo.gl/wzx3cy "Kotlin for Android - Part 7 - DSLs (Video)"
[folder with materials]: https://goo.gl/F1wEPJ "Kotlin for Android - Drive Folder"
