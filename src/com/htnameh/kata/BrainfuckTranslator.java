package com.htnameh.kata;

import java.util.Stack;

/**
 * @author hemanth
 * @since 22/1/19
 */
public class BrainfuckTranslator {

    public static void main(String[] args) {
//        System.out.println(translateToC("++++"));
//        System.out.println(translateToC("----"));
//        System.out.println(translateToC(">>>>"));
//        System.out.println(translateToC("<<<<"));
//        System.out.println(translateToC("."));
//        System.out.println(translateToC(","));
//        System.out.println(translateToC("[[[]]"));
//        System.out.println(translateToC("[][]"));
//        System.out.println(translateToC("[.]"));
//        System.out.println(translateToC("[>>[<<]]"));
        /*System.out.println(translateToC(",[,,[,>]].-+.+,,[.[-...<+>-++<,]]-<[<-+->,]>>..<+<<.<-+[<.+,[-,]..<,<[[,],[<>[,]]<-[[<+.+<<+[<[]]]]]]" +
                "<<,.[<-,.-,,+>[+,+]<<.[<>-[.-[,].,]],[>,.,,.<],].,.-[]+->>.+>+>,<.[-.--<-+-]+-><-.-[>---<>++...]" +
                ">.[,[[,-.++,+.]>,<><[>.++..[.[-,.[>,..[+..-[>..-[++-,-.][>.,,[<--<]<.,+>.+,.[.>[>.+.+.[[[],[][.,]]-+]]]]]]]]]]]]"));*/
        System.out.println(translateToC("<+.-<[,,+]><.><++[<+>-++.>+-.,..+,->]-<,.>[<,<[,[+[>,>->,]>]-],[]..[[<<.,[..>.,],,.]].<-,<-]>.++,.<<[.<++[]<->,,][,>[,,+<<,>[[,]+>[-]+[.]<,>,-+[-><<-<+.<+-<.]+[<[][].]-]+[-]]]<>,[<.[>[->,].,<.,.<]><>,->+[<.]>.[,[<++,].[[>[,+[,[><[].,+-].<.<--+[-.]>>>].,>+<[+,,,<<,,<->-.[.,><+<]<+,<+.-]--.[+[.+<]<,.]][,,+<[><,<[>>+,,>]+<>.,<]]-]-][-[,>[.>,+->,.<+,,++.[<+]+>---]<+-,-]]-+.][.,]<>.+[<>+[+]<[>.]>,,--.]]>[>].++-+-,.,>+-<[]->-<-<,[-<<<,-[>]-->]--<>.[[->.,+-,.-.,+,+]-><>-.-.>,],.-,[-.-[.,++,.[<[-+,+.+[-[.,,.-.,+]<+[,>]+>.+.].]>>-,[+.,]<,+>>],[>+]][<>[,].,>>,[<[[].][+<<>,<+,<.][,>>>>[-<+,<,[[+.]]+.<,.,[.,+<,+><..<-],]-++[.-]+[[[,<,+-.>+-<->,>.,...>.+[<<][-].>[<>-<-]<+>++>.-]>+,]>,,<]][[.-[],-]->+].>[+>..][,>--,[,<>]-[-<<[].<-]->,->-+<>],<[[[>+><.>-<[>-<[[],[[[,]]>+>.,+.]-+[[++[,>++>>[-><[-[[,][.,<++<[>+.,<[,->++[<].,[<]+><<--->.><..[-.]++[]>.+,>-.<.+.++>]---.[]>.<].].[.+,><-+,]-<->]-<]-].,,>-[+,.>]],>>-<<]<,]-]<],<][]+...[>,+,]-[+>++,<..[[,+-,-<+[].+++<]-+.]],.,.].]]-<>],][[<->+<..>+,].[,]][]-[<-]>+.-[]<>->+>.+++,.-.[]>>>[-->>[+<-<+<+]-<<-,.-[<..]->+--.].[]+.<[]+>>.,-[.-]>,<[+[-,[.,,-.]-]++[,<]+,,+.>]-[++,,<<[.]]->[-<,[[+>-,,.<[>-]],-+>[][],>],+[+[+.[>-><<[[--<>.+->+-[<]+.>.--><,,+,<[]-[<+]->.>,[,+[,+[,,[.>.[-[+<.]+[.[+]]-[.+,+].>>]<]>,->>+-<<-[[<,-.,+..-<,.[]<,,]++]]>--[>]<]<+>+-],]->.,,<].[+.+>]>..]>+<]+,-++]<,+-.-<..,+->[]+<,]++>-+[..,--,]>>+>[-[<-,[>[.[>,,>>[<.<[.>-+>>[<<>.>+[[]->[<[,,,[[]-]<>.]-.[]<[->.[-[...,..++,.<-<,[],>+<,]..]]-[][<><.->[<<.+>.,[<-,-.],-[,[>>],[-<]]-.]-],->.+[,]]-<>[>[-..>[[]-.<,-[<[+>>>>>>>+[]>]<]-[.[.,[<],.[].[--+...]>,<>>,.]+[.,]<-++],+.<>.+<->[]+.-+>>,[-<.[]+,,[,+-,.]<.---[..-+++<-..+<-,>.+,->,.+<<-.>,>>].<,<,+<<++[+<,><[..>-[<[-.,,].],-,>[,<-,[+-->]-+,<<[.[-,,[+<+->-+<-+]]..<>-[,>+]<.>+.<,.],,<+]-.,,-,>--<<[+<+<--,[.+-][-<><<[,<<,<[,]-[.+]][.]+],>[--.,>><<++><>[>,,[]-...<]>[].>+]<-+<[-.-[,[.]+<++>[<<.+<[[]][]-+>.--,<>>+[-..<.<<--+>,.+<[.,<.,>[--]<,-]+-<-,,.[][-.>,[<-,+<<<[>[+[[..],,,.+.>].+[-<>]+[[>]-.-.[->-,-,+[-+,[-<,[>.-+[>+]].<+[--[<..]-,-<>--,,<[,]>>>,<<.><[...-.>--+[-]+-.-+<+.>-[>.+.<],-+>-<,,,]>.><],],[[.<[,><>+,.>,,-+,-..+[->]<><]-.<.++-[+<>,+]-+[>]>,.<>,<+].][[>,[.<,[[][]<-,--,>.<+,,<].[],+<<>-]<<--.]-<<--<].->+[,].].,]->+[+-<-.].-]-..<][-<>,[[[<,.>-[]+<-<<<-..]><.>,-,<,<<[[[,],<<[.<+<+<,],>[][.<,]..+[].<-]-<+--,].->[<+<[-,[<<[--++>.]<[]>+<[,,<+,><-]>.>-+]>]-<[>,][<<>-[+,<-><<->,>,,.[+<[-]>,.>[,,>.<+.,+..,+.,>>->[[,-.>[>][,+,+[-.[<.<+[],[+>,-]-].<+[<.]<<.-+.]][>>[[][]-[[.],>+<->>.[++[>><<-++,[+<[+]-],[]->]-+>[]>]+.+.>.<><],,>...><-+>],-<-,.[,+]+-+[>,.+-+[[+--<,]>>]->>,.>]>,<.,.-+>,>]<.-+.]<<+]><,+]-,]>][].>[<>,+[-,..]]<>+.+.[[+-<]+.+[.,-+>->+,+-[,[.>].]>.-,]-<[]]<+].-.-,-]-<][-..+>,[+>.+<..><[<<+[<<+]<<-[-.+>]]<],-<,][-.-,.,->,,,,.,+->>-[,+>.-,..>,--+]>-[>+>[++.[,,.>[]><.-,>,]><<,+-]<][]>+<,->,]--<].>++-..<-+.,[<,>-.<.-[<++>-+<<<.,.,,-<[<>,]<+[>>---.]-[.>[>-.]-.>-.],-,-]-[+]+,>[<..-<<.>+,<>-+..>]],-->].>.>-,>,]-,>.++[+>..[<[,,<,[[>[.[--<[[>[<+><<+,<-]-->,-,<,[<[[.[.-[][+>--.]].>-[--<[[-+.<.-.--,+>.]>.<.-,-[+[<<+.,-,>]],-<[<,]-+,]<.>>>-]<.]]]>[<[][][<-,]-,++.><>+,>..+].[-<<>[>,>.],>+[,]+.[[<<.+->>>[>]<>[-]>,[<<[+],]>]->.,><--].[][+,+,+,]<-<+<-]>,..<+-..><<<]-<+<,].+->]<<,]]->.>.[.-]+[]<[<>,<>[],,]+,,,[..,<-<.,[>--><[,<>[[[-[,+]<,.+<,.>>.[><.-]+[,+>[.,-+,-<>][<>-<+.>.[+>,][+>>,+],<,.[.,.,[.+>[.++<<>+>>+],>,]->>[++].-..,[--.[>-.--]-+.]]>..[-[,>,+<[<,[]]<][-+-]<++]-.+.[]+[.[]+[>[-[[[>>+<<][.,>[++,,]],,.++->>[>-]<-<-[]<]>].>+,.]--+<]<,---[[>-.][,+]]-+]>.]>.-[[]--..+]+>+.,>>[--<[>,<+>.,+-<-+,,<+][<,>+,<,[],<.-]..[[<+[<<+.<]<-][.-]<[<[.<<[<<-[.+--.,.[[[.->+[.][+.<>+>,-,++.]+]]++>.,>,>-,>-+<<++<]>[]<+<<-[<>[..><[]><][+>+.>]>[[>]-.]][]+<<.+.>+],]-<-[>[].[-.>>.>,--..,[]>+-+.++-+[-.,-[>>++[>->[<<-,[-,<->.[],>><--><,,,<<[-]>-[]<.]+[][[-[>,.,[-.<]++.[]<>]-+-.++-[,<+,[][>]+>>.]>]>,[>]><-++>.[],[+,][>,--[[>]+]+,[+[>,]+,,]--,-[]<,[]>>,+<+-][-]-.<,[][,-<[->+][[<,]<<<]+,-><][<>[<<<]<,[+<.[[[[[.[-]<,.]--.<]..]-.[[[],>+,+]-]<>,[-++<+>,+-.][,-[<->[[<>..[][+>.]<-]+,[.>][[<-<+..[<+,[<,-]+-+]<<[[>[-.+].-][].-->>><++.],<],>--<,-<-].[[+.,++],-],<-<>[]+[.,<>,[.[-]>.<+[<[],[[+.<<[.>,>]++>-<+.[].[].+[,+<]+,[,.]][->]][>,.,[->>[-,-]+]<.,..].-<+<.>..-><->>[[[<-.>.]-]-[,<-+--.],,>-+<<><]-[[+,]<<+,>,<.+<,..,<->>[]>-]>[+.<,<>+<[]-.,>[[,>+><><-+->+]++-,+-->+>-.,]]<,.].,,[..<...[[,,[[<[[,[-[>-.[,[+,><+[[-[>>><.,]++-].>,]>-.[-.]]>]<+-+.]-[-+<+-[.>>]-,+>,.><+>><,-[+<++<][[[>,]+,,]]+-[+>,[[..<,.,>+[.>[+,,,]]+->-+[..[>+]]<>,,<][]-].+->][...>]<<[+.[+,],.+]<<>[<[,+++-[<+[>-[,,,+]<,-,.,[[<<[.-.,.[>,><+<<.><,,].<-].]<+]>.][[.<-+<,]]>].,<<>[.][[<.<>[>.<][,[++,-]<+].]<-+-],.>>,,,>.[[,-.>+-[.++]<<[++.++,-]]-+,[,+><,.<[><-.>,-+-+++--,->.>-,<-]]>+]-->]]]-.],.[,,>.--.,<]+]>>,,]>-,.><-.-[+<,+[+-..+<-<[+<,]+.--++-[->>]+,-+.<+++[<>--+.+,.[<-+[+,..+]-.>.<[]<.->,[->,>[+->]-,.+,,,>[-].>.[<,+.,.[,+,>++<+,+<+>+<,>[>>-+-+<[>>,,->][]<+>,,[.<+<[++>]>[]]++[<]<+<.,[.<[.->-].]--],,]..>-.,>.-,+<]>,,-+,],+[>--]+,[+[<[<,.].<+<-<.+>.,..<>]<,<>[+,<[--].+>]<.-[-.[.,[.+,<.>-,>[,+<],<]]>]-[++--<[,-.>>[]]-,[<]------.,<..<[[+><,.]...]..<.[-]]+<>>>.<,,>[]>>]>-][+.>]+-[.+][,+]-[<+>>,->,-]+>.->[++<>--].+[.<,>>].<],<[<><][.+-<..]]>+]>+>+..,,.,[<>>+.--],--[>+-]-].,+]-.+<<.,++.][>>],.].+>+[].[,,<[-.-<>-><.[.+++]<->],-<>><,+.+<..<]>]]]<<]]].]-,-<-++-.]>->,<,,].<>,>,.,-++[<-,.<[+.],]+<,+.<,[+++.+,..>-,]>+..,,<+<,<><-,.,>[.+.-<++]-][+].<[,[[.[[+.]]].>-,>-<-]]<>-<>><<<[,>+]>[]<.]->+<<,,[,[-+,>,<+>[+>+.][.]]+.,],--]-<>..,.>,,[><+.[<]][.>>-[]],,[,<[+>--.[-<.--[-]-<>[+]-],<]+],-]+>>.,[.>,<]+<-><>+-,+[[+[+,...]+.[][[-.[+,-+[,.+++.[]].>[+]..-[-].,->]..]<+,>>--.,].<-.->-<.+.][,.,-]-][+[,-[+<]+.<+<->]>,[++,[><+<<,+[,-[.+]-.><+-,]]><<>]<-.]<>>.+]+-<<-.]]].><].]<[>[,[][.[[,>><]]],<]]+.[>.].+<<+[.]>,[[<[-..[[[+>-[[+,,,,-<]+[,],],-[<->[>-]]><,--,<.[>,,<]><.+>-,].>,[->,].>>.,>>.+.<,+.>[<-<],-[---<>.>-<++>..,,<.][<.]<]][>],[-]+,],,+],<<.>]-.+]++..+<].>++>,<[<,+>[]>.>,<>],,<>.++[+<<--][>][>--.-]+.<>..-[,-[][,[+-<,[.+[,>]-+]+-,.>>]+-[]<.>,><-[-+-<<]>][<]]],[[]>+[--+]->..>].,[]+][<,<>+>--+<,>-,<>-<-<]..<>,+>][->>+-<[+.-]>-<.[+>][.,-..-],,.>,,],.>-+>,[>>-,..[--,.,.,[+[<>,->,.[.+[[+,,],[-+>[<[<<>]+-,[<.-,.><>+.+[+>[<>].,]+++,>,[<-<<-.[[-,,[,.>,]>[.+[<[],>>-[]<,<[<->.[<.+<[[,>.>]<,-.>]<.-,>-+[[-]],>..[].,,]][<>,-.+-.+[,-<<[+.[[,[,><><<.[].].+[+>..<,,<]<-<->-.,>-+<<-+->>>>.--.<-<,<,<<]+-+]+<--]><>-+[.,>-[[><-,][[-].+[..+.]<].,-<<].<<<[,,><+-+,,<,-<[,[.,]>-<+-->-.<>.,,<]]+>]..[<.]<->],++.+,>>,->.,.,,+>.,>]+---]+,+.[>]>[+,>-<>>->->[,.-[[[>,->>++[[,<>[+,[<,,][><,]]]]<><]+>+-[]++-.>>.-+>+]<->><<+].+[,][,+>.>--,-,--..[->,>+>.,.>,>-[>>>,[<].[<<<,+[]+>[>]],],,].-+.,..],<[]>,+-,[-]>.]+]]<+<,]-.>+>.<.,,,][><-,][,+--.++>+->+.<><<]>>[,<[<-][[-]<[<],[]->-+[].[]<>[,<<[]>-+.]<-+,.><-]>.<.>,.>,,,.,-,+,+.<[]<-]..<>]].,-[]<><><>]+[->,-.,.<+]+[,+>+,->+..+[-[+<.<[.[[.-[<][-..,[[[-]>>-..+]-[]..,+>,]]]+[[.<<[,,-[.[[]<.<..<>>+.>]>],.++].>.+..<,,,<,.>..,][-<]>-,]..<-,++,<,,>,..,-,+.]-[,]+>--.>[>]++>.<]]].[.<>-+-]+,[+]]->[[.]<][.>[,<-,+]+<,]-[>]<>>->>.[.,-,,--,>-]-<-[++[.,->>].>++<--+--[-<]..<.+>>-><..<++<,.+]<..][-,-,]>+[[>,.,].-+.[<[,>>[.],.]]>>]<][-+[<+>,].[[>>]]+,[-[,><+]-[<][<,->[[->....[,]<[>[+-[.+].<<--,+.<-,.,,,>[,.-]<-]<>,.[<[[<.],].<+.-<.<+....]+-,<-+].].]<>.,[[<[.>[++-<>[,<[],>]-[[].+++,>[+>]]][-[<[+][..+,<-[+<[+-]<,<<][.+<<>,[<]+>[.,>+-+][-,]--[,,<,<+].[->,,..-.+<,--[--.,<]-+-->-<<[<]<+,-,+<,[<<,<+,]-<-<>[+,[<,>-.>>.++.[[->[+[-,..[],+<,->++>>]>,++.[,<]-[].,.-[.>+>,.<-[+-[]><-++,.-,<[,]]-]<,.>]++,]]],<<<[-,>...[++.,<,>+>]<+<][>]<---.<[+.]+>[][,.],]><,+,]>]-+,].]-.]+<,>-]<..[<]]<.<].]+.,.++<,-<][,.>-+[<[>]-],-+-],][+[.<[.<,[.-+--><]>.]>-+>.]+-<][->]>>],.->--]]+-,[,,.]>>->-[,.[-][<-.-[<>,[[.]<.+[.+,.[[>+-.[],--],<<.[>+],>.,+>].-+]][[-..,<[-+[-+.<>>[[><-<+><[<<][+[<<]].,->>[>+.>]-.-+-+,+><]<>]>+.+,,+<]-->><>,+<[+--++,,.->+>>->].,<.[,][..-.]>.--]<>.-[.]].++-><-,-[...-+[<>,.<>><[]>]<-.+-,+.>[[]-+[><.,,.],>+<,-++<+[>-+,[+.-.+<<,>+-+[,+[,-,]<[]><]><[,>.+[]+,<.[+,.<--+--[]],--.,[,.,,]>+,->.[<-+-+]]<.,,-,>,-[+]->+,]>],]]<,[++.][+],.,<]>>,><,-->-.-[[+--,,,<>]<<-->++]],..]<>,><.]>+..,,<]->-[-.>>,,>..<-.+,.[<][+]]<.]..,]+..+.>],<>.,+,+>-,[>]++[-.[.<-]<-.<[]-,..<+<<>[<+[]+-[[]+<,[+<,+>[[,]>.-,.<]-..-+>>><]]..>++<]-,>,-],<<[>+>],<.<][[.,>][[]>.<<+<[->]].-.,<,,+>][-+-[><[>.+<.-[+->.].]<>><[+]>-+,+<.><<.,<><-<+,]+,<]+],.[[><.,>><+-<,[]>]>][[.->,[>,>++[,],,+,<>]]]<>[[+],.>-<,.-.+.+,,]><-->+.-->.>-<]-><<+]++<-[[<--<[.+[<-[><,.[>,[<<+->.-+++-.>,[<-[,.->,<-.,],>-+.]]]]<.]][>]+<<[+]<+[>[-<.<[.[,<[[[--<.+.,<<-,[+].[+---,+]]]>,][+,>->+++,<]].>+<.,],+,].>-,,]+[[,]-+[[,]]].]]-[,-+][><,..+]--[].]<+<[>+]>+,+,-+[.>-[,>.[<].-<,+[.<><,.[],[[..>-[>.>[.]]-<.]+.[>[[---],]+]-[-+,<.+[+.>>><+]><<-+<.<<+>,-[+-[],-<.<,.-+-[].>[<<,<.]],.<<++]>-,>+,-]-[+]<]],-][,>]>[[.+,-][+]+-+><]]+->[->+[[,+]]>[[++]-<,<-<,,,>,].-<,[-.<.<],.+]],.],],<]],,.<+[,+,[[++<.]<+],]-]]>][.+><-[]+,.].<-<[.+.,->.-+<],-[[+]-+.>>+++.]+<]>.[+<<][].,][+->+>]]+,><][+,,[[-]]]-.+][.,+.]]-<.<+-<]+.><-->>,>>++[]<[-[].[+<[]<,>,,->>-->,,,.++>[.->>>]>.+.>+<+.>-]+>]+,+]..][><-<]<-[]<---]+,->.[+,.->]-.[,[+-,,]>.>[-],].>.>[[]+<]]+]..<,]+.-><,+->[+[>]-++,-.],>-[,<]->+-,[]+[<][]<-.>,<<>,<<<-,.+-+-[-,[<[.-[<.<-,,>[+.+,.-,>+.[,<[,[>[<--,-++,]>.]-[[[<-->.<-[].-[>,+[].[],]+><.>,.+-<<+[,,]-++,,.[>,[<.<>+-[]<],<>.,->].-+,<-.++>-]<.]<-,<<>--<,-,-[>-.>.->.[[-+,>.<[]..[],-<+++>->.-]-+[++--<+]],<.>.[]].[,>,,-[-[<[+>,>+-..<-[><>...[-+,+>[+]]]+.<..,<..+,,]+<+.-[>]]]+>.+,+<],.<-.].]..>+>[.<><,->]].->.>+,[+...[,><<+->.][+].><..[[..[,<><+<,,-]+]]->->>]<[,<>+[->]..[[+,,+]-<.,+[,>+>---]]>+[]<-<[+,<>>.[][+,+<,-,-<<>-+[>>>+-.[+]<[,-.++,[+-.]+.+<<><<]-.,-.>.[++-[,[,[[.<[+.[.-<><]+->,[,-[+[>-+<]>..-.<<>][+>+>.<.+[+<>.->[.],[<,[<.[<,+--+...><>,+-[]-]]+[+[<->[.].-<+,,.,[[[[[><.],-<-.+->]>,+][,[]++[[.,[>.[->]+>-].,[>.,][-<[,,[+<,,]+[]+[+.[,[++,--,>>]<[-,,[.]++]<,][<[,<+>].<<<+[->][<+],<]]<.<,]<]-.[+<..<,]>[+]+.<,,[,+-.>+<.,.---<>><++.,+>.],,,++.>]+[<<-].<]+->[>+,]<.,.]--+]]+[.>[].-,.]--<>-,>>>>[+.<>,[[>-.-,++.<]-<[>->]]+,,>,]]],>.>->[>><.<,>-,[>+-]-+<,+-<-<]+..]+.>]]<>+.><++<]++++,+>>,-,<.<.-->-,]-]<<-+[<,-,.]>]]-,-,]]]]<><+<>>.,+>>[+]+,[]-.]+,],.<[]<.-.,>]+]>-><>,>.]+>,+[.,,.[,,<[[[+-+,+[]..+[[][,[>-,,>]<-+[--],+[><><-,<><]>+.-+.>>[]]++<.,>-...->.,-<,][-][]+.[><..[>-[],>[+.,>[,+]].-[,.>>[[]--][..[+-[<>].[..+++<<[+>+>+],>>>>-.[.[-[><<]+-]<.><]]]]>],->+<[[-+>,+-++->]>->,,[,<+-.-,-.,>[<>>.>++>[>+]>..],><++>+,[]]>>+[>[[[<..[]<,<].,],[+,>.,.<--]>+,]>],+>.>..>>[<],[],+,[-<,[,]>].[>,,,.+],+>++]].>],++[[.<->[>--].,[-+.>+[,>+[<-[[,-]><[->,]-.][]+,>>+.>>+]--,>>,.++<,.<++]+][.,<<>..,<<.-<,<<.,++]-.+,<<<->><,<,-.]>,.->]+-<+-[+[]-,[-.,[,>><]]<,[[[.<++..<,,]+<[+]<--+[,.<,]].,+[+-[]>][->-..++[>[..-[-[-+..,->+-<[.[<+.+<]-<>...+>->-[.-..[+.-,][[,,.>.,<<[[>,.[<+-[+<[]-+]..].,-[.+],<]..[,[<]-,[>[-[,.<,]++<+<..>]<+]]]<<++>+[<+-<-.]<.>[.-<[>.[-<,<-<-,>].+>+][],,],<+,<>+[+]-+,.[,]]<><+[-->,<][]+[[>],++[<,[<<-<.>,<[-[>>>>,.[+-]>[-[.]-[>+]--+,+]-,,][<,.]+,[+<,+.[,.<,,].]+.+[<-,>+-[.[,>-]]][,>],[[,[<+,>-+][],>],>,><[[+.[-<>++[-+[]-<+<+.>,-.>+--[>>>]],,>.[[<>-.+,+>>[[,>,[.<<.].>.<,-[-<]++<]<].<>[+-.><<<+[.<,+.-[,<-.>>[+,<<.--[[[<+-><]+<,[.,--.]>.->>+[>,++[<+>+>+]-[+.<<<,..,-]><+<-]]+-+>>[,-[.+[>><.<+..->>-<,>-[].[.]>[]>..,[.],>.],[-<.--<-[---><-]+<<,-[-++]-.]+.].>+],]<[]+<+>+>+>]<].-,<++.[-++<-..,]-,+-[+..+[[<[,.<,+<<.++>-+>[>>-]-+[-.>+->-+,++>[-.-+]+>><->>>-+>.->+]+].<[<<+,..-<<,]<-<]]++-.><,<-]+>+,]],-]<<+[-<].+.,[-]<+<+<>.--[[,+][>,+.>>.+.[,,[+<][]+,.,].+]-,++]-+-.++...[+<.[,]->>].+>+,+<-[,--.>,]><,-<.,+<[<<,[.>-<][],.<>,>+[+.+[.<>,]<[[>].+.,<-[<<>[+--]+,>>->><+-[,+,[+<<>++]<<[+>,+[.>,,.][.>+]+[,,<..>>].[.<[].-<+,+]>>+[<>><-]][[][-><>+[++.+-+]>+>[,>--++,[-><[+>,]-[,,]<-[->,,+>[[+..-]-<>--<-,<.,<]->>>--++->-]][<]<.>[[+,..><[-]],-[[+,>.--]-].-.>,][<.<<-]---+..]+<-[<]<.[-<>,>.,++]-+.-.]-><<<[,-.[]>+].[,<<]]>.-[>>.,[..-><-<,<+.<[<,],<,--+]-][-[+,-+]>[+++.[,,]]<]--,+]<[>,+-,]>>].]],[->[<]]>,-,--[+,[+<-<>[-[,><]]>>[<+],]+<[]]<,,.+.[]]+.,+-[<,---><]-[]<[[.].,<+>.][].>.[]]]-[<-,->.,<][-<]<,-.+],[,..[-[<]-]>]>++-<,[,-,><,<.[.<[.,+-.>-,.[.>>+<]-[<.[+.<>,]<+<]>-][]-.+[<<>+->.,[[],.-.,+[><<]]<,][]]+,++,>+,,<]]+.[>>-+[]<.-<.[[]-]><<<[>-><,><.],+-<..[[->++>-],->,>,]..>>,[[+[]]+-<+]][.+<-,-]]<[-.>[[<[<,+<,].[<>.[+-+<+++.][-]->[.+][]<+.,<][.[-+[<]>-<,.+++-,+[-<-[]-[-,].],+],][.]>-<-+>][]+-.,<--<+[,+[,><[-,>>+.,,<-,+>,..[>+>].]]]--<+[>],,-][]-[+..++>..<<<<>+-+<[,,-><--.+.-<-,.+<]+[[,,.[,+<.,,],-.[[,[,[-<<.]<+.[,-]<,+->[>,>>+][>-.]-[[,.<-][,+[.[[-.,[>+..<.++>,><]<<,--<>+]<.[-><.],.,<.]]-<>-.[.,,,+>]+>-+[[,<+<>-],]<[><+<><[>.[[[+-[>],-+-[[<]<-[[+-.,[].<<,-.<[-+]]...<<<]<,][-]>,[>]<]+[+->+,][>[-,+][>[,]<+.>>][+>+--+<][]>>]<,-+..<.,>]+,][.]-<>+[<+-,,],[<].[-.>+<[,]<>.].]+,[.[]<].[[]][-,<><],.-[,,+,]+,-[[-<--.-<,+[-[+.<+>-+[>.+>][]]>><[[,,<>[,.,[>-...+.-],+<.<..,[>>][<<+><,]]<.++<<<][>+[,>-+-<[>]>+,>.-[[.-.>[<-,.,[[]><.-.,.[[]><.[,-.-.>].<++]-<..-<>>++<>>>>]>]+,[+<]]->>[,,,].++-<->,]+.,]-+.[>++,<>><.[-]>>[<+<,[>>[+-],+,-,,.->[+.<.<-++]]+<,<>>.<<-+[]+,-[+-<<+[<>.],-]>->+[,.>-+[.>.,++>+]+<<,<->...--[[+]>[+<>->,--],]+[<-][]]]].]+,,<<+++.[.],,.,+[[><-<,<.+,-+<-.<>-,>.<.[,[+.]-]>->-+].]+..,-[<>--.[..],+-<.]-,,...,<[][-<>.>.,.<[<,->-.<]+]>+[+[>>.<+].>,-,>>[,.>>,+<<,],.>>><],-].>.--<-,[],]]+<>]<++]>-[[>>-->>.,.+[<--[<>]]]>-,[]-.>,]>+.+.<<<<[<,.[]+,+>>++]<]<>.]>[].->.>-]-[]]--]][,]<[-[,><-[+++,[-[>>.<,]<[]][.]..<-[>+,<]]]-<-[].<+,,[,<[].,<+-.->.[-<-><]>+,[.>[[-<[+<.+<+,-]+<+>.]]-.<<<].->--[<.>]+-+<>+>>]>>>[]]-],[<>+<-,+]]><<]--.<,>[>+-]+...,,+-,+-],.<++<,>+<,]->,,<[[>->-.]+->><.+.>+-[<-++<<-[-,>]->+++[,.>><>--->+.-->[-[>[.[+-+<-.--.]+>+.+[,]>[>,]..+>]<+<+-<[+..+,><.[->,+[-[+]+]-+[,,<]-,>.[>[-[-]->,]]+,][[->>+>,>]-,],<->]<++>.<,>]-[,]]+].<.<]++<]]]-.+.]->]<[]<-.<]+.,-[->[+,<<-,-<+--<[>.-[.+<[<]--]].+[>+].>+>>+,],++,+>+.[.].><-[.<.+[]+>.]],<><..-[.+[<.>>>->[..-+><<.+<+>>[[.<.++]+,,]>>,,.<-+[.[+]<+.->[]+]><,].+,>]]<<+]+..]]+[[,]-,<>.+].,]+>,,>]-]+<.<][,+.+.-[><]>.<<+,[]]>>>,[-<>+]+<,],>+>]>-+[+>[>,[[.-,>[<+-+,+[.],.-,[]>]<---+],[][+[<]-]<..]--<[..[,+,].,.[>+<,,<[+[].]].]>]<+.+<>..],,++,+>.[>-.<],.-]-+[>,],>>,+][+[->..-[[+>-][>+,.[>[[-,[>,+]>>[][[..<]]+][[-><,>>+.+.+>,[]><.->-,><,---.-.,[>[[-,[>-,]+>]]-<++[,]---+>><>+.>[>]--+[[+--<-,>-]-[][>-,-[+.,]+->><]>>[.>.+.]->[.+<[[],.+--+[,-]<><..<[<>[[[->]+-<<.]<>>.+[<+,.>[>,[,-,>>[.[[->[,<>]+,--<>[+]<[]+>,,..,.[-++[-]>,.<.--<++,.>,+,><>..,+].>>+>,[]..><[+].-+.>[+],[],,.+<>+<,-,<,<,[>-+[+<<,-+><.<<[,>[,[,,.++.[-.[,->+]->-,+++[>[>].>,>--+-+]]>..-]]],<<[>,[-+<+,+[[+[..[,[>>.<][,.<+-+]+]<>[..+-]<<<]<,+,+,[.+>]].[]-.++>->+>],<,>]<-.],+-<[>[]-]>.><,,+.-,<><[[..+,,.,+.>,->,]],>>]<>.->+>.,><-.+++]+[],-+[-,-<].-,]<-,+<,-,->-]-]]-.-][<+.-][.<-,><<-<<[->,.+]],>[>>.><-+><-<.<-<.][[<[[].>.+..-]]-[>+<[]+,-<,>.<+-<[[<.]+<<+.][>>+->-..,[.]-><-<.[]+[-.],[-<<.,>].+<<>.<>,[,].,<-,,,+>>]>],->[-,-<,+<.[>+].-++]..-.>>]+.+-,,[-],<[>]]+]+.]>.,.[].]<.>[[++]>>]+]]<,>+[,[,<].[]<.].->,-]+-<.>]<+[-,..,+++>[[.[,.-],><.+-[.]-+-[]++,[,[,>+>+>->,>.-].[<.]+,,,[-].>,[->+>.]]-[>->,.<][,<>]>],>+]]-,-,]-+,>>]<-[,[-]+][+.>+-,[<[<]<-<><-,,-,]<<,[]].]<,<+-]<.><.,-].>]<>][[++[-+--]]-+,<]>]<]+>-+]]>[]>,..<,[-],,,.,-,++->[.<+]>[.[,<[,>+>,>[]>+.[,++[+,<+,++>.[<.+-.->>.>,<[+>,<,>>+<>>>[.>+.<<[[<>,].]>]>],]]<+..+-.-+]],-+>.<.<<-+[>-<>--]>-,<>>+-.<-.,<.+,+,[.-,[,+,][.+,]>]+<>,+],.>]->>+[],[]>+>+>[>><,<,>.-,+<>...><-.<-,-]-.<++<..+,.+,,<,-<,--++[>,.><-+.[>-[<.++-,.[[<,]]---,-[+][.>>[.<[[[]-,.,+-[<+[+-<--[].>,+[<,,<.--,,<[.-,.>,.,-<-,+[-+.,>[-.++.[]--.,->.>+<[[>][.>>[>>+]+-[],-<.,[><+]->><---[<.]].[.-.<,++].>>-+>.-,]-[[[+[.+>-<]<.]].]>].>,<-[<-]],>+>]<]>][>>[.,-].[.>-[<,+>,-[[[,->>,>>>+>[,,>>]-+>,>[.<[]<]][,+,]]<.]-+>>]++>]<.[<.][<+.-[]]>,[..-][,-+[]+,.<-.,-<<+<.-->,>[>+<[>+-,].,<,>-[+>[[-<[.>>]<-[--,+][+><][]>.><].-++,><,><,]>>]>],]<-,[-]>]]>]+<++]+,-[<-..-[+<].+.,,.[--,]][][,+[>>[.<,,.<+[<.,<--][<]-..-->->]][[,[]],[,.],-,][+].[]-,-.][][>.]>,<->[][.]<++..]>.<]]<+<>,.>],-<.+[][].][[->+<,-,[]>>[++><[,,.]<,[<],.]-]>>]+>>[[.<.[<>,.-[+.,-,,-]>-.>.+,>[+-.,-+.<.[[>.+<[>]..-+,-.,+<,][+.,,-][].[[],+,.[.,>[-<]>>-[>>+.<>>,,[++-[]]<<<+>.,,,>,<-+[><].]-[]+,<[,-,[+.<+[>.->>[+-[,-[]+]<,<-<<+]<+>[]><-[]]>++>+,++[--,[>---,>]<,[>++<+.[->>.<[][>][-.+<]][]><<--+]<,-,[-+<,<+>+.,]<[[[.+],>]-<+],<+,-[>[[>,-.+>,[>>>>>>++..[[<,[,<,++,]-]+]->]+-+>+[+],[.+-,]<,[,->,.[-,+...[.].]+].[<,][+],>++><,+<..>,+>,+<,>.-+,[>.<]]++,,<-<-[<.,>]>[,--.<<,],+<-<.++><+,],>.[]+<[>--.][>+]]<+<<]+].,>-]<.,->-,,+]-+-<+[....>][+<,,-]+--.->----.-++-<>+,.][+<,<[+<[.[-<>>>,-+<+,-+,][<->]+-,,[][<].>,>[[]]>,,+<.-[+].>[><><,>[>>]]+..+.,<.+]>]-<-<-,,,[],,+.>]>][>--,,][<-,,.<[>>>.<>[<[.[-,--[>[<+-<>[]-<++<+[]>+<,]<>]-,<<,[.<>[]>.-,]-[-,-..]][]<]],]>+<[>[>-,],-<]+][]-,.[--><-[>><<,.->.<,++[,,,]]]]-+]+<][[,[>>->.>.+>+.>[+<+.,,]+.-[[]]>[<<>+[],>>+].-<]]>-<]+][,,,[+][-[.[,>]]-,.,]>>++[[>>[].--,.,[[<+<,]..<]+<<>->[,[<<+>+><,<-,[,,]][-,+.[,<],,<-,+.<.[[]<+.<,]+>.-,..<>+[,.,<.]]+<[.,.<,>,<-<>><.+->-+.[.-<-[<]]+-<-->[+--]>,>,,.,,]>-<,,<<.,>,<-]+]],>.+<.,.[--<<]>],-,-[>,-,]<+<--++,,<++<[.,][<<.>.[[]]-[--+>><---.++.<.<<,+>,+-+]-[-+<.<,.+]+[,>,+>--+[[]],+].,++,..,.,-+><,.>[[.+<.-,[.+[-[].<++>>>.<,<.<]>-+.+.,[<,>,].<+>],>>[,[-+<],+].],,-].<,-].+,+.[],.><,--<[],.+,>-.+--,[]>+<<<<[+><.-<],<+><.-[]>+.<><,<>+.<+<[.]>>.+>,,.,<>.[<.+]<,>.+[+<-[<<.,>,[.]<-[>][,.>>,]+][-][[<[,]>>,<>>-<<-+>-.,]<-++]<+>[<,,>.+>[<,[[[<,<]+[>.]+-[-++]<.-+][<,[<<.<[+>]<-[<-.<],+-,]]..>,>+>,[,-][[[,[++.,.<>+><.>>][[>][[-]++-+].>+-+<+<<.<--[,>.,.,,<,-[+..,>--.>+<.]<.],]<.]-+[[+>>]+>.+-<,.<+>.<[-..+>[<-[->>,+,<[>->.<<+<.+<.][+><,<-.<<>[+<<++[->]-<<<.]<.+-.[[<[>-<+.>].>>++.]<><>[><<.].]..<<<-->,[->[<,-+.>[+.+]+..,+-[[-<.],[[[>+->[+>->.+->>.].[.[,-]],...<..-[]..<>+,]],[.+-<+[[<<>]<,..,>.[<+][>.-<].[++<+,+-,],]+>.]>>+->-+]][,+>][+[[.[>>]-[,+<>[,,]<.<.,,>+-+<+<++]+]>.++<.+>+++,].-[],+[<[+.>]]]>>.<+<[,[<+<<]>,-][+[+>-,[--][+>>>,<-<<.]-[.>[],-<],]+>],.---,+[<]--[[-],.>[.+>,<+>.<[,+++]-><]-,.,<[-<]-,>>.[]].>,>>.<]>[-><>+>]].<<>]<,-<.<-]..[+,<[]+<],<<]-+]<.<-,<,-.,,,,.<,<,>->]>.,,>>+>[>>[<,.]<>->[+][,+>,,]><[<+.[-+,+>,->-<-].-+<-<--.><,+>.+-<<<[>.>.--[<.>-,.]<,+++<>]]++-]+<--.[>++++---,>-,++<<,+-.<-.<<>+.<.+<+-][-[.>-.><<[>[+.],].>]+>+>-[->+,>-],-<.,,<+.],-[,[[<>,..<<>+>[]<,]]<,,,>.<.].],]><]-]+.,[[<]<.]+-<,<,,[,+[+..[.]<.-,[+[<[<+,>>>,.-,>+,[,.<+]..,--+.,,>.+]-,+[<[<]+,]]>+..<<><.>]-,[+<-][<<]]+[-<]][<<+>+>[]+<,]..]+>-<<+]+>>,<+-..--<+<.><.,-+>,[].[+-,],.>[>].++<>,,,-+,<>>>[<-[][-..],.+>-<<+.,<]-+[+++]>..->,.+[[+-.-+><<+<[]+><]]+,+<<.,[>.--[[+>,-+<-]<>[<,.].].[]<][,-><<,,<.-[+>[>>.[>>]-,+>>---]][]]>--[-].,[[<],-,-]<--[].+.->,--+,>+++-[]<,-+,-+-.<,<++<[><,+-.<.[.].>]>-[].[+,<+[+]-,<[<+,,-[,.[-][[><][][.->>[],>].><>-,>[[,-.[>--<[][+][,>>]-<+]+],,>><[-].<+]]<>>,[][+,,->,,[,,,>-+]<++.]+,-+]]-<[<><+>-,,>.].<>--<+-[.-<,.>[-<.,<+,<]-+]<[,[[+<,.[[>>>.-[+,+>[,-]<->,,><<,<+++]+]]>]<-,,,<.]><<,-+[-.-]>[<.,+>+<.[[->],<<<..,],,[,,>.][]+.,-].>,+[]..+<-.[>[,-],++],>+>.<+-.[>[[>>+]<><[[[[[[>]<[.<.<<[[]]>]>++.]<+]-[,+.-]-<+.],.++<.<+>>,.[>-][-<,[.,>][->.[-[-[<+>+>-+[].-]]>]+[+--],+>.].[+]-+[]..,.[>>++-+-,<.,,-[.-,+.>[.]>++,...,.-[--..]>]]-<>]<,[<]-+[>-].<,>,->]->[<.>,]<,-[[+>],][.[-<,[,<]]+]<->.[.]+,<+-]],,+,[-++]..-++[,+<+[,..,--[-+]->,.],],++-.]>,+]+[-,>+>,,[>>>]+->[->+].<..[]+[+-,>-[-,][..<>+>[<>>[.<..---.]+<>+..]++<,,,-..[+[++<--,.+,<[.->]+.->.,>++[]>>>[>[]>+,[-,<-[>,+<[]-]+,.[],>+,<<..><.]+<[,<-<,,<]-,<>[+-.][>>>>++[,-][]+]+>,,>.-[<++<<]<<<++,,[-.-[-.<]+[,.,][<-.++[,[-].[]]<.].++><[>..<,[,>..]>>+>]<]<-<-.<,],.+[<[,<.-<+]<..-,[+<+<..<]][,-<,<-++<+,>+>>,[->]-[,]--<+,,<<++.-<]]+][->][]<[+.]-.[++<--[.>.<,+-.,.][.-<+++<<[[+<]<[[>+[]+,[...-><<,,.]>>,.]-,[-]+,[][-]>,>]][,[>>.,+,,,]]-+[,.>-[,+,.+]<,<.-][->]+,>>-+<]><,,>><,.>---.+>[[[+][,,],.,>+],<>-><.,.+[],<<>]-[]<+<,]]><.,++,,]<[<,<-<[<[.,+].>[>]+-].>]>-[<-+>.,..]<]<<<[-]-]-,><<[++<].>..+.-[,+.>-<[[]<,],,-,,]+.-[->+].<,++<-,-[,.,][.<[[[.>+],[+<[>]>>....--->[,]>[-]-,->>.+..,+>[],[-.---<[<,<,>[+],+[.+].+>>,>[>,><.<>-<]>]><+,-,+<[+]<],.[<>[-]+><+>.<[+[,.-<-+[],><..[<..,>][[,<]>,,[[.]+>]..+><<>]],>--.[.<]]<..+[>.--[.+.].,,.[.[],]].[[--+-,,[><[[-<+-,+,.-->]>..-+]]..]+><+[,-[[<<-][,-[[<-<,]<>+--.]]-<.<.>+-,,.>]-[-+<,]],[-.<>>.+,[+,-+]-<],-+,[+--.<>+].<+[,.>,+--.><[,.+[-[>><]<,[[]<]>-.[<.,,.+,,+><-.<><]]+[],,]..[,-]>+,-]-]<<,[[,+--->><>,+-+,-.<[--,--+[.<<>[]>,]][>>+.],--,><],-+<>+]]]]]]"));
    }

    // + - < > , . [ ]

    // + = *p += X;\n
    // - = *p -= X;\n
    // > = p += X;\n
    // < = p -= X;\n
    // . = putchar(*p);\n
    // , = *p = getchar();\n
    // [ = if (*p) do {\n
    // ] = } while (*p);\n

    private static String translateToC(String input) {
        Stack<Character> characterStack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case '+':
                case '-':
                case '>':
                case '<':
                case '.':
                case ',':
                case '[':
                case ']':
                    if (characterStack.isEmpty()) {
                        characterStack.push(ch);
                    } else {
                        if (((characterStack.peek() == '+') && (ch == '-'))
                                || ((characterStack.peek() == '-') && (ch == '+'))
                                || ((characterStack.peek() == '>') && (ch == '<'))
                                || ((characterStack.peek() == '<') && (ch == '>'))
                                || ((characterStack.peek() == '[') && (ch == ']'))
                                || ((characterStack.peek() == ']') && (ch == '['))) {
                            characterStack.pop();
                        } else {
                            characterStack.push(ch);
                        }
                    }
                    break;
            }
        }

        int sanitizedInputLength = characterStack.size();
        char[] sanitizedInput = new char[characterStack.size()];
        int bracesCount = 0;

        while (!characterStack.isEmpty()) {
            Character character = characterStack.pop();
            sanitizedInput[sanitizedInputLength - 1] = character;
            sanitizedInputLength--;
            if (character == ']') {
                bracesCount++;
            } else if (character == '[') {
                bracesCount--;
            }
        }

        if (bracesCount != 0) {
            return "Error!";
        }

        StringBuilder builder = new StringBuilder();
        int indents = 0;

        for (int i = 0; i < sanitizedInput.length; i++) {
            int tempCount;

            switch (sanitizedInput[i]) {
                case '+':
                    tempCount = 1;

                    for (int j = i + 1; j < sanitizedInput.length; j++) {
                        if (sanitizedInput[j] != '+') {
                            break;
                        } else {
                            tempCount++;
                        }
                        i = j;
                    }

                    if (indents != 0) {
                        for (int j = 0; j < indents; j++) {
                            builder.append(" ");
                        }
                    }

                    builder.append("*p += ")
                            .append(tempCount)
                            .append(";\n");
                    break;
                case '-':
                    tempCount = 1;

                    for (int j = i + 1; j < sanitizedInput.length; j++) {
                        if (sanitizedInput[j] != '-') {
                            break;
                        } else {
                            tempCount++;
                        }
                        i = j;
                    }

                    if (indents != 0) {
                        for (int j = 0; j < indents; j++) {
                            builder.append(" ");
                        }
                    }

                    builder.append("*p -= ")
                            .append(tempCount)
                            .append(";\n");
                    break;
                case '>':
                    tempCount = 1;

                    for (int j = i + 1; j < sanitizedInput.length; j++) {
                        if (sanitizedInput[j] != '>') {
                            break;
                        } else {
                            tempCount++;
                        }
                        i = j;
                    }

                    if (indents != 0) {
                        for (int j = 0; j < indents; j++) {
                            builder.append(" ");
                        }
                    }

                    builder.append("p += ")
                            .append(tempCount)
                            .append(";\n");

                    break;
                case '<':
                    tempCount = 1;

                    for (int j = i + 1; j < sanitizedInput.length; j++) {
                        if (sanitizedInput[j] != '<') {
                            break;
                        } else {
                            tempCount++;
                        }
                        i = j;
                    }

                    if (indents != 0) {
                        for (int j = 0; j < indents; j++) {
                            builder.append(" ");
                        }
                    }

                    builder.append("p -= ")
                            .append(tempCount)
                            .append(";\n");
                    break;
                case '.':
                    if (indents != 0) {
                        for (int j = 0; j < indents; j++) {
                            builder.append(" ");
                        }
                    }
                    builder.append("putchar(*p);\n");
                    break;
                case ',':
                    if (indents != 0) {
                        for (int j = 0; j < indents; j++) {
                            builder.append(" ");
                        }
                    }
                    builder.append("*p = getchar();\n");
                    break;
                case '[':
                    if (indents != 0) {
                        for (int j = 0; j < indents; j++) {
                            builder.append(" ");
                        }
                    }
                    builder.append("if (*p) do {\n");
                    indents = indents + 2;
                    break;
                case ']':
                    indents = indents - 2;
                    if (indents != 0) {
                        for (int j = 0; j < indents; j++) {
                            builder.append(" ");
                        }
                    }
                    builder.append("} while (*p);\n");
                    break;
            }
        }

        return builder.toString();
    }

}
