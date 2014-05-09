$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('com\cucumber\click.feature');
formatter.feature({
  "id": "angry-birds-clicks-rest-api-gets",
  "description": "",
  "name": "Angry Birds CLicks rest api gets",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "angry-birds-clicks-rest-api-gets;get-many-clicks-by-clickid;no-special-characters-in-movie-titles;2",
  "description": "",
  "name": "Get many clicks by clickid",
  "keyword": "Scenario Outline",
  "line": 13,
  "type": "scenario"
});
formatter.step({
  "name": "I click a banner by \"pub001___cpn005___ldp001_mbp\"",
  "keyword": "Given ",
  "line": 6,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "I get the rest response",
  "keyword": "When ",
  "line": 7
});
formatter.step({
  "name": "response should contain \"200\"",
  "keyword": "Then ",
  "line": 8,
  "matchedColumns": [
    1
  ]
});
formatter.match({
  "arguments": [
    {
      "val": "pub001___cpn005___ldp001_mbp",
      "offset": 21
    }
  ],
  "location": "BannerClicksSteps.I_click_a_banner_title(String)"
});
formatter.result({
  "duration": 290079325,
  "status": "passed"
});
formatter.match({
  "location": "BannerClicksSteps.I_make_the_rest_call()"
});
formatter.result({
  "duration": 1929831026,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 25
    }
  ],
  "location": "BannerClicksSteps.response_should_contain(String)"
});
formatter.result({
  "duration": 4821003,
  "status": "passed"
});
formatter.scenario({
  "id": "angry-birds-clicks-rest-api-gets;get-many-clicks-by-clickid;no-special-characters-in-movie-titles;3",
  "description": "",
  "name": "Get many clicks by clickid",
  "keyword": "Scenario Outline",
  "line": 14,
  "type": "scenario"
});
formatter.step({
  "name": "I click a banner by \"pub999___cpn999___ldp999_mbp\"",
  "keyword": "Given ",
  "line": 6,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "I get the rest response",
  "keyword": "When ",
  "line": 7
});
formatter.step({
  "name": "response should contain \"200\"",
  "keyword": "Then ",
  "line": 8,
  "matchedColumns": [
    1
  ]
});
formatter.match({
  "arguments": [
    {
      "val": "pub999___cpn999___ldp999_mbp",
      "offset": 21
    }
  ],
  "location": "BannerClicksSteps.I_click_a_banner_title(String)"
});
formatter.result({
  "duration": 104204,
  "status": "passed"
});
formatter.match({
  "location": "BannerClicksSteps.I_make_the_rest_call()"
});
formatter.result({
  "duration": 961100084,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 25
    }
  ],
  "location": "BannerClicksSteps.response_should_contain(String)"
});
formatter.result({
  "duration": 105600,
  "status": "passed"
});
});