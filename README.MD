# Тестовое Задание для Bybit

Сборка доступна в разделе [releases](https://github.com/JorikFat/TestBybit/releases/tag/1.0.0)

## Используется следующий стэк:
 - User Interface - Compose
 - Presentation - ViewModel
 - Network - Ktor
 - Serialization - Gson
 - Asynchronous - KotlinCoroutines
 - Dependency Injection - Koin

## Скриншоты
![Загрузка](/materials/loading.png?raw=true)![Список](/materials/list.png?raw=true)![Ошика](/materials/exception.png?raw=true)

## Порядок работы
При запуске приложения отображается индикатор загрузки;
Если данные загружены без ошибок - они отображаются в виде списка элементов;
Если при загрузке данных произошла ошибка - ее информация выводится в нижней части экрана; 
Если данные не загрузились из-за отсутствия интернета - в отображении ошибки будет отображена кнопка `Повторить`, нажав на которую данные попытаются загрузиться повторно;

## UML
![](/materials/UML.jpg?raw=true)

