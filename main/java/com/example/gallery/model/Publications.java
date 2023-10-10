package com.example.gallery.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Publications {
    private static ArrayList<PostFolder> posts=new ArrayList<>();
    private static Publications publications=new Publications();
    private static int avalId =0;

    private Publications(){
        fillPosts();
    }
    public void fillPosts(){
     /* posts.addAll(Arrays.asList(
                new PostFolder( "/sdcard/Pictures/салат.jpg",null, "Цезарь",
                        "Салат получил название не по имени Гая Юлия Цезаря, а по имени человека, наиболее часто называемого автором этого блюда — американского повара итальянского происхождения Цезаря Кардини, который в 20-40-х годах XX века владел несколькими ресторанами в городе Тихуане, находящемся на территории Мексики (поскольку от Сан-Диего Тихуану отделяет только граница, такое выгодное положение позволяло Кардини избегать ограничений Сухого закона). По легенде, салат был изобретён Кардини 4 июля 1924 года (в День независимости США), когда на кухне почти ничего не осталось, а посетители требовали пищи. В 1953 году салат «Цезарь» отмечен Эпикурейским обществом в Париже как «лучший рецепт, появившийся в Америке за последние 50 лет». В классической версии основными ингредиентами салата являются пшеничные гренки, листья салата ромэн и тёртый пармезан, заправленные особым соусом, который и составляет суть рецепта. Основа заправки (соуса) «Цезарь» — свежие яйца (желтки), выдержанные 1 минуту в кипятке и охлаждённые. Яйца взбиваются с оливковым маслом и приправляются чесноком, лимонным соком и вустерским соусом. В классическом виде салат получается довольно лёгким, поэтому к нему часто добавляют более калорийные продукты, например, варёную или жареную курицу. В диетическом же рецепте заправки чаще всего используют сметану или йогурт: с молочным продуктом смешивают дольку чеснока, чёрный перец и ложку горчицы. Сохраняется классический вкус цезаря, а так же блюдо помогает держать себя в форме.","https://www.edimdoma.ru/kulinarnaya_shkola/posts/22917-salat-tsezar-klassika-kotoruyu-lyubyat-vse?ysclid=lgm2g9x242163208459"),
                new PostFolder("/sdcard/Pictures/bsuir.jpg",null,"БГУИР", "ведущее высшее учебное заведение Республики Беларусь в области информационных технологий, радиотехники, электроники и телекоммуникаций. БГУИР включает в себя 9 факультетов, 38 кафедр и 1 обособленное подразделение.","https://www.bsuir.by/?ysclid=lgm01aodbb141306586"),
                new PostFolder("/sdcard/Pictures/minsk.jpg",null,"Минск", "Столица и крупнейший город Белоруссии, административный центр Минской области и Минского района, в состав которых не входит, поскольку является самостоятельной административно-территориальной единицей с особым статусом. Крупнейший транспортный узел, политический, экономический, культурный и научный центр страны. Является ядром Минской агломерации."),
                new PostFolder("/sdcard/Pictures/pin.jpg","/sdcard/Music/pin.mp3", "Смешарики", "Истории о дружбе и приключениях обаятельных круглых героев. Весёлые и музыкальные, неожиданные и мечтательные, домашние и авантюрные. Целый мир в одной уютной ромашковой долине. ")));
*/
    }
    public static void deletePost(PostFolder post){
        posts.remove(post);
    }

    public static Publications getPublications() {
        return publications;
    }

    public static int getAvalId() {
        return avalId++;
    }

    public static ArrayList<PostFolder> getPosts() {
        return posts;
    }
    public static void addPost(PostFolder post){
        posts.add(post);
        avalId= post.getId()+1;
    }

    public static void setPosts(ArrayList<PostFolder> posts) {
        Publications.posts = posts;
        if(posts.size()!=0)
            avalId=posts.get(posts.size()-1).getId()+1;
    }
}