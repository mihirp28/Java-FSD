var div = document.querySelector(".board");
var Board = /** @class */ (function () {
    function Board(list) {
        this.board = [];
        this.appendList = function () {
        };
        this.board.push(list);
    }
    return Board;
}());
var List = /** @class */ (function () {
    function List(title, card) {
        var _this = this;
        this.listOfItems = [];
        this.createList = function () {
            var listItems = document.createElement('div');
            listItems.classList.add('list-items');
            _this.listOfItems.forEach(function (item) {
                listItems.appendChild(item);
            });
            var h2 = document.createElement("h2");
            h2.classList.add('title-style');
            h2.appendChild(document.createTextNode(_this.title));
            var lists = document.createElement('div');
            lists.classList.add("list");
            lists.appendChild(h2);
            lists.appendChild(listItems);
            return lists;
        };
        this.title = title;
        this.listOfItems = card;
    }
    return List;
}());
var Card = /** @class */ (function () {
    function Card(paragraph) {
        var _this = this;
        this.createCard = function () {
            var pi = document.createElement("p");
            pi.appendChild(document.createTextNode(_this.text));
            pi.classList.add("lorem");
            return pi;
        };
        this.text = paragraph;
    }
    return Card;
}());
//some demo card/paragraph values
var cards = [];
cards.push("Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat");
cards.push("It is a good platform to learn programming. It is an educational website. Prepare forthwRecruitment driveof product based companies like Microsoft, Amazon, Adobe etc with a free online placement preparation course.");
cards.push("Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat");
cards.push("It is a good platform to learn programming. It is an educational website. Prepare forthwRecruitment driveof product based companies like Microsoft, Amazon, Adobe etc with a free online placement preparation course.");
//creating list 
var myList = [];
myList.push({ title: "Telepark", para: cards });
myList.push({ title: "Talkola", para: cards });
myList.push({ title: "Buzzworks", para: cards });
myList.push({ title: "omatom", para: cards });
myList.push({ title: "Optique", para: cards });
myList.push({ title: "Cricket", para: cards });
myList.push({ title: "Hockey", para: cards });
myList.forEach(function (data) {
    var card;
    var listOfCard = [];
    data.para.forEach(function (element) {
        card = new Card(element);
        listOfCard.push(card.createCard());
    });
    var NewList = new List(data.title, listOfCard);
    div.appendChild(NewList.createList());
});
