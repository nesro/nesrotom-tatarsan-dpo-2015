
eclipse->file->import->maven

================================================================================
pry to je: maven project?
--------------------------------------------------------------------------------
2. cviko: class diagram kde si rozebereme problem

model: domena, vypocet, stavy
controller: zachytava interakci
view: zobrazuje to to mam videt

model: trida model (muze mit: score, 



MODEL: Score, Cannon, List<Enemy>, List<Bullet>, Gravity, List<Collision>

Game (v casovych intervalech posouva vsechno co je potreba)

SOLIT principy: jednotlive objekty jsou potomci nejakeho GameObject

GameObject:
- Position <- XYTrida
- Speed
- collidesWith(GameObj anoth) : boolean

CONTROLLER:

!! model je atributem controlleru
Model.posunKanon(2);

VIEW: view si je vedom jaky model zobrazuje

model bude vedet jaky ma pozorovatele. kdyz se neco zmeni, zavola update
na vsechny pozorovatele a ty zareaguji. teda treba view, ktery se vykresli kdyz
se neco zmeni


<>IPozorovatel (View)





po spusteni se to musi inicializovat













