This repository hosts the coding excercises of a Kotlin Workshop for Android. Basic knowledge of both Android and Java are assumed for people going through this workshop. No prior knowledge of Kotlin is required - the linked workshop presentations, videos and workbook start from the very basic syntax in Kotlin and build from there.

The linked presentations and videos are a recording of a live event held internally at Yelp on May 24th 2018 and may become or already be out of date. If we hold a new event we may update this repository and the recordings. Otherwise updates to this repo are rather unlikely.

## Format Of This Repository

There are a total of 7 apps in this repository. If you follow along with the workshop you are supposed to start from the folder `app` and build your Android app by following the instructions in the video and the workbook. If you struggle to complete an excercise you can simply look in the folder with the corresponding number. For example `app4` contains the Android app that is the result of completing excercises 1-4. Another example of how to use this folder structure is if you are interested in completing only sessions 3 and 6, then you can start from `app2` for completing the excercises in session 3 and start from `app5` to complete the excercises of session 6.

## Format Of The Workshop

The workshop was intended as one whole day event. It was split into sessions of about 1 hour each. Each session was about 20 min presentation, 20 min live coding and 20 min antendee coding something relevant to what was presented. Presenters were available during the coding sessions to answer any questions and troubleshoot problems. By the end of the day we built a simple app to show a list of businesses using Yelp's public API.

There is a [workbook][workbook] with everything covered. Here is a list of all the sessions and a brief summary of each session's topic.

## Syllabus

* Part 1 - Basic Syntax and Types - how to create classes, interfaces, functions. At the end you should be able to write a very simple Kotiln class ([presentation][prezi1], [video][video1])

* Part 2 - Constructors and Control Flow - difference between statements and expressions, conditional statements and loops, jumps and qualifiers, primary and secondary constructors and the execution flow when constructing instances ([presentation][prezi2], [video][video2])

* Part 3 - Functions - operators, inlining, a little bit about generics, named parameters, lambdas and closures, obtaining references to functions and passing them to other functions, higher-order functions ([presentation][prezi3], [video][video3])

* Part 4 - Properties and Nullability - java interop, synthetic properties, delegated properties, custom setters and getters, lateinit, ​nullable and non-null properties and optional invocation ([presentation][prezi4], [video][video4])

* Part 5 - Useful Kotlin Standard Functions - use, let, apply, also, with, isEmpty, orEmpty and some more as well as how to use them and when to use them ([presentation][prezi5], [video][video5])

* Part 6 - Kotlin's Collections APIs - mapping, transforming, filtering, aggregating and associating anything you can iterate over like a boss! ([presentation][prezi6], [video][video6])

* Part 7 - How to build DSLs - What are they useful for and how to build them ([presentation][prezi7], [video][video7])

All presentations, videos and the workbook are shared as is in a publicly accessible Google Drive folder. If you'd rather download them and go over them at your own pace [here's a link to the folder][folder with materials].

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