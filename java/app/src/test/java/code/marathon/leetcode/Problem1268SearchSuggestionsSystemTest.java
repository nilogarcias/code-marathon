package code.marathon.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem1268SearchSuggestionsSystemTest {
    private final Problem1268SearchSuggestionsSystem tested = new Problem1268SearchSuggestionsSystem();

    @Test
    void suggestedProductsTestCase1() {
        List<List<String>> result = tested.suggestedProducts(new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"}, "mouse");
        List<String> search1 = List.of("mobile", "moneypot", "monitor");
        List<String> search2 = List.of("mouse", "mousepad");
        List<List<String>> expected = List.of(search1, search1, search2, search2, search2);
        assertEquals(expected, result);
    }

    @Test
    void suggestedProductsTestCase2() {
        String searchWord = "havana";
        List<List<String>> result = tested.suggestedProducts(new String[]{searchWord}, searchWord);
        List<String> search1 = List.of(searchWord);
        List<List<String>> expected = new ArrayList<>(searchWord.length());
        for (int i = 0; i < searchWord.length(); i++) {
            expected.add(search1);
        }

        assertEquals(expected, result);
    }

    @Test
    void suggestedProductsTestCase3() {
        String[] products = {"tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnunqerptgas", "zmmirsxdhyxvmdybjzondyvrkzeafhvualsivfueweuusmsxbttdeofzeripaqv", "tyqcpfvorznmxxdzepfxabibcagilwjsqncxnpjqsxjzqqqbae", "tyqcpfvacyrjvmadrmntxotgvgivdvcuwygpjfwcuppunolukrum", "tyqcpfvrqwrcpusmfyhxaiasfbb", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqyalwiaj", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchidnpt", "lfjkcljnd", "zibrwfpwecubjlsjbkrhnvolnnzrqhdynloplzagwnuhpxhbvpxnqaifnln", "ybswoottdgryxtupichpvqjmcoytrwnfgzrrnaejojvpzmttlzw", "tyqcplghosxjviooiyddhvzzrhuuwkiosmgafxyajcdyqlmthqkoylxhtxdruw", "okoscfpxcndzgbtsozdofgnomtglmoaewgzzjvrxezoq", "cxkwvaytkxgafeltbanhsvxlorigkuxnsxlmhvwqm", "iamtabcpdagicnvdvqcfykonsazrbdivxtczpgqgxjrifukmqjw", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbneryahanhrhkal", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnunl", "tyqcpfvorznmxxdzsuyushueegfrnlzbydnefcfagqnxglkulegntoml", "zlovtmburfkd", "vlzfaamutsfqefpafzffwhvpfw", "bbufxzwpryyakbxuhwwplvdptgybbykqxirsrahsokviihxrawcbgwrktvgacmwtc", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbzw", "kjundphljswl", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqhlqnapfkcqpdb", "stcphvgxvcaysehvrfdfllwvxf", "epbtkgnnupbbdqgheyaks", "gilhnlfkdz", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwghy", "yswdsvnzucvsdzrmeghevjrfuhoebfedvyvortaxppwqncmspctdcjlwdxfnc", "baizdtmgozykukcrkapsnp", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgcsfjgtwqqubbhjkzmio", "iblyydfzztmtyjmgrxvyjwcobfyxcgyrbtnfhhxswxahze", "tyqcpfyggtmjahhpjzwhohvchyofsxwkehq", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniaymgkdduoabmp", "gpsqlqorcbqffdxlnijgvzvxilnbkynwscuoymqyg", "eidradnaqjwmucbrgtp", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzopnqxxcxshbhdmippldmcuxlvc", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbfmryrbgicgzqecje", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuze", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqandxbuvshebs", "tyqcqqxonxtwakxlrceyknbockvovdwumbjkfrgmudiafbqlflonfavpsrfq", "tyqcpfvorznmxxdzsnkjnrrzpfourbghe", "ziarqmfvzqpqhunfxwfwjtetotozkjaszznbtrvtxarysaxq", "tyqcpfvorznmxfmlzlcuikpxvahtfbfipjcgmeusshufvnirwcopdnvnop", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvdertpdpdjsngezrnyjxotgonuigmqkgipgb", "tyqcpfvorznmxxdzsnkjnrrzpfvfcvufmzzuqrjubsfzp", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqorqffebhoyfvgkspenqpcmvoxpybkjg", "oqojrvinnhlwuqllcsabkpfiusfucpjbsxzzhlgduawaqyp", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchviaxsw", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqnzudhzclswotlbgdffwiekw", "csgadyglxddodloklsegvsbtgtkloklmxkbxxyorcqwybktuzpyeaqasn", "tyqitegmijccjwxuwvchbvuvllmgsdugzxdkiqvnllhmsjyskxpzzds", "tyqcpfvorznigwmavbguxwhunsshdybhzszxvlnpingqgaghkqzeynbbbhgcxeydir", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnunflh", "tyqcpfvorznmbwmhfmudnurhismirfgvojpdmclw", "tyqcpfvjijiwoup", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejemb", "tyqcpfvorznmxxdzsnkjhvabtzucyooctzzrgehlsuyinrrnzjilfpalvqgwoey", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchvie", "tyqcpfvorznmxxxvjwfgcwegpibuifhfxyomnicutaegshpnschktxknqytritr", "tyqcpfvorznetvhiaobezckojwjbeg", "tyqcpfvorzmjabuccipqln", "frutebajqddrtrsmabfmdcgipssymldwscxbbrbpb", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchviotvqi", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchxeyrnlh", "yaxaddctugikoutgcwqsdekghoemtooljxvysnzqqvgpc", "tyqcpfvorznmxxdzsnkjn", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqggjwxdvqesbgrqei", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckoktdj", "mzwjshgbgbdogqbrhfgbjkrqogyynbdwwkdclsbpynlrhxeucuuo", "tyqcpfvorznmxxdzsnkjnrrztrqgpbvvxm", "u", "tyqcpfvorznmxjnsgyirdtzpwywpnrvgadkmdjghlmerbqysaebyge", "tyqcpfvorznmxxdzsnkjnrkjelwoqorxsnyjqdnxfava", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchvqqy", "hcav", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchviof", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwreznx", "yesupowwycvcdbknhrkfyvnpoqtdhcbhybqvhnvgukoohh", "hcvlnbmcrepblcqrvwpfsyevlpyldptubnxkntqhpounxjcw", "lwaxzivycjkanvikqpbrvdvjkaclyuyfitwfycsnfwjg", "tkruiswrcbzsbkwbhhvjzzuuiayqzbxjosjssacislcvbtcojpmyatkfgyx", "ftujoohzvjonlwxwskeydoxpfvbvrdndbhgpuvykif", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqqngbpbdtufkgunalbekxbkpajlgbjtqmswh", "tyqcpfvorznmxxdzsnkjnrrzpewgvvnicz", "tyqcpfvorznmxxdzsnkjnrrzpfgknjxnepksgdzwxsbziwdzsiiyarxhtpp", "jumcvboxaxjfybdlezcjrarolxjtsuweaigkiudusinfmnczdualqzlpwkm", "tyqcpfvoxegnpqesbaugr", "bteznmwyh", "rtbpifxevchngjnlumvtqtpebgtoznvvrzfxqzmcktoxydbstbvukrunnyeqwfd", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejysfrlewzsgukyahggau", "mvrrbfbfwyrxooopgcbwmtjfepejyfrqdkyaqencqqlagoilrtdndfyn", "tyqcpfvorznmyrzwhjxvhooytltygrakvgkqumrimazzhzoueyqnjz", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchviob", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwoyvqczogovza", "tyqcpfvorznmxxdzsnkjnrrzpfgknvfnzshqqfpr", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjghvqg", "zqrnaierpnsigujuxrftdiauazddadqmrwcimxyztwumwzyjcrqvuexnitdecfgo", "xusxbbilivpovzsjvfsdnacipk", "tyqcpfvorznmxxdzkbqgrgeolnwhtvlckmiattpmxwwtmlifnexxbgtpjslwhczrjlhr", "eiuytvdzhcodcrdgthxynurtpsdyguupijjluucpfinrfnsjkdbbzexfmctejlgvd", "tyqcpfudqjrabwwvdvwmsyscnazaxpsjjhetouegipqevvointclztzummwrrbntjlsj", "tyqcpfvobzfvbiuoktjcqjfx", "tyqcpfvorznmxxdzsnamc", "ajqpomnpmsayhelmhfehjbvjaeszqigfqyuixbtyjy", "jpfxangixfavlhcssecxljksydrjxmaldhwpftinywtbmffsmtslefcuddk", "txryxhtutwdrqmpcapbcrlmhzsobueefwfekusmmylr", "etzqiepphjcleaocnwljcdn", "tyqcpfvokfxlbmbzmitacnromkoaoxl", "iddmxxcmwecfutbrbqeihhlnypckofuhkbydmljfemzrvlxsuskxkbgviybzu", "tyqcpfvorznmxxdzwilcfwrdlfqppdnuvgltuoooppwyomtvtggmsfxsxievdlsyame", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvzquhbkvburnhmerkuabrfcjwanzmfenz", "tyqcpqgaus", "zsbcqgctsjdjyfkdvcehawsqzacafwtjmhemfygdahkexvmkqkcehvek", "tyqcpfvorznmxxdzsnkjfesxjshxtlinfjltdfl", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnubpoqoghhgbpew", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdcuudsuqq", "tyqcpgwivyfquxqhbkjbioekqbsd", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnudxocavmwpggka", "tyqcpfvorznmxxdzsnkjnrrzpfgknvnlxdokehsjhiohwdeyikeajzipztzhwmxc", "pmpoycdxttisazazsgiswnsnhdmejpjbygvtjhwqydeugbouekvornbeiwmpehikbz", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwcpoxr", "qmgnrjtavzsqtwareroiihendgcvbzbcolvfoanmixxrxdtnmtevvv", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnunix", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetxpdyhmk", "tyqcpfvorznmxxdzsnkjnrfmy", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetaoqgbczdcemzlmqemy", "tyqcpfzmlffhifutomuvfvwaqatopvur", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvdvagddprewvlgx", "ozmyertmnlwybntwxmpynuynhqdbqhosvjwexzqgvdtnvxexxwwwwhqktmzbfkjfn", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckohyof", "rniiqnzbctzeyeeyrxhfzqgbccplsncvtswcrqmevplfzadlulazmpmhdojwaokn", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzakckmtmjxx", "tyqcpfvorznmxxdzsnkjnrrzpfgkhdwienfhpsqbyrvotbgchkkmvk", "tyqcpfvorznmxxdzsnkjnrrumaqtylptffsjzygeumkahutdmalkqtrhtgrsrqcyyti", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchvioncnr", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchvigzpo", "tyqcpfvorznmxxdzsnkjnrrzpfgkeduq", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnccdnakfkhtg", "lhehmbyzcnlwvr", "tyqcpfvojuuprlby", "wds", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqvegfwmtdcrvdb", "tyqcpfvorznpkeynkmbbyptclmhxxlyjzejqbcatgfrmkbbmxs", "tyqcpfvorznmiqmfrhihxsagizcrwyaukrjwbbgrxdzknq", "ghhlssixrouzbqcpmxzmsnybaygtb", "jndewk", "tyqcpfvorznmxxdzsnkjnrrzpdqanmxattjhgnflnoyynevsxvpbwfmfrnlc"};
        String searchWord = "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchviotvdticwxwcliylrpvrokbcguhnfvpd";
        List<List<String>> result = tested.suggestedProducts(products, searchWord);
        List<List<String>> expected = new ArrayList<>(100);
        expected.add(List.of("tkruiswrcbzsbkwbhhvjzzuuiayqzbxjosjssacislcvbtcojpmyatkfgyx", "txryxhtutwdrqmpcapbcrlmhzsobueefwfekusmmylr", "tyqcpfudqjrabwwvdvwmsyscnazaxpsjjhetouegipqevvointclztzummwrrbntjlsj"));
        expected.add(List.of("tyqcpfudqjrabwwvdvwmsyscnazaxpsjjhetouegipqevvointclztzummwrrbntjlsj", "tyqcpfvacyrjvmadrmntxotgvgivdvcuwygpjfwcuppunolukrum", "tyqcpfvjijiwoup"));
        expected.add(List.of("tyqcpfudqjrabwwvdvwmsyscnazaxpsjjhetouegipqevvointclztzummwrrbntjlsj", "tyqcpfvacyrjvmadrmntxotgvgivdvcuwygpjfwcuppunolukrum", "tyqcpfvjijiwoup"));
        expected.add(List.of("tyqcpfudqjrabwwvdvwmsyscnazaxpsjjhetouegipqevvointclztzummwrrbntjlsj", "tyqcpfvacyrjvmadrmntxotgvgivdvcuwygpjfwcuppunolukrum", "tyqcpfvjijiwoup"));
        expected.add(List.of("tyqcpfudqjrabwwvdvwmsyscnazaxpsjjhetouegipqevvointclztzummwrrbntjlsj", "tyqcpfvacyrjvmadrmntxotgvgivdvcuwygpjfwcuppunolukrum", "tyqcpfvjijiwoup"));
        expected.add(List.of("tyqcpfudqjrabwwvdvwmsyscnazaxpsjjhetouegipqevvointclztzummwrrbntjlsj", "tyqcpfvacyrjvmadrmntxotgvgivdvcuwygpjfwcuppunolukrum", "tyqcpfvjijiwoup"));
        expected.add(List.of("tyqcpfvacyrjvmadrmntxotgvgivdvcuwygpjfwcuppunolukrum", "tyqcpfvjijiwoup", "tyqcpfvobzfvbiuoktjcqjfx"));
        expected.add(List.of("tyqcpfvobzfvbiuoktjcqjfx", "tyqcpfvojuuprlby", "tyqcpfvokfxlbmbzmitacnromkoaoxl"));
        expected.add(List.of("tyqcpfvorzmjabuccipqln", "tyqcpfvorznetvhiaobezckojwjbeg", "tyqcpfvorznigwmavbguxwhunsshdybhzszxvlnpingqgaghkqzeynbbbhgcxeydir"));
        expected.add(List.of("tyqcpfvorzmjabuccipqln", "tyqcpfvorznetvhiaobezckojwjbeg", "tyqcpfvorznigwmavbguxwhunsshdybhzszxvlnpingqgaghkqzeynbbbhgcxeydir"));
        expected.add(List.of("tyqcpfvorznetvhiaobezckojwjbeg", "tyqcpfvorznigwmavbguxwhunsshdybhzszxvlnpingqgaghkqzeynbbbhgcxeydir", "tyqcpfvorznmbwmhfmudnurhismirfgvojpdmclw"));
        expected.add(List.of("tyqcpfvorznmbwmhfmudnurhismirfgvojpdmclw", "tyqcpfvorznmiqmfrhihxsagizcrwyaukrjwbbgrxdzknq", "tyqcpfvorznmxfmlzlcuikpxvahtfbfipjcgmeusshufvnirwcopdnvnop"));
        expected.add(List.of("tyqcpfvorznmxfmlzlcuikpxvahtfbfipjcgmeusshufvnirwcopdnvnop", "tyqcpfvorznmxjnsgyirdtzpwywpnrvgadkmdjghlmerbqysaebyge", "tyqcpfvorznmxxdzepfxabibcagilwjsqncxnpjqsxjzqqqbae"));
        expected.add(List.of("tyqcpfvorznmxxdzepfxabibcagilwjsqncxnpjqsxjzqqqbae", "tyqcpfvorznmxxdzkbqgrgeolnwhtvlckmiattpmxwwtmlifnexxbgtpjslwhczrjlhr", "tyqcpfvorznmxxdzsnamc"));
        expected.add(List.of("tyqcpfvorznmxxdzepfxabibcagilwjsqncxnpjqsxjzqqqbae", "tyqcpfvorznmxxdzkbqgrgeolnwhtvlckmiattpmxwwtmlifnexxbgtpjslwhczrjlhr", "tyqcpfvorznmxxdzsnamc"));
        expected.add(List.of("tyqcpfvorznmxxdzepfxabibcagilwjsqncxnpjqsxjzqqqbae", "tyqcpfvorznmxxdzkbqgrgeolnwhtvlckmiattpmxwwtmlifnexxbgtpjslwhczrjlhr", "tyqcpfvorznmxxdzsnamc"));
        expected.add(List.of("tyqcpfvorznmxxdzsnamc", "tyqcpfvorznmxxdzsnkjfesxjshxtlinfjltdfl", "tyqcpfvorznmxxdzsnkjhvabtzucyooctzzrgehlsuyinrrnzjilfpalvqgwoey"));
        expected.add(List.of("tyqcpfvorznmxxdzsnamc", "tyqcpfvorznmxxdzsnkjfesxjshxtlinfjltdfl", "tyqcpfvorznmxxdzsnkjhvabtzucyooctzzrgehlsuyinrrnzjilfpalvqgwoey"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjfesxjshxtlinfjltdfl", "tyqcpfvorznmxxdzsnkjhvabtzucyooctzzrgehlsuyinrrnzjilfpalvqgwoey", "tyqcpfvorznmxxdzsnkjn"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjfesxjshxtlinfjltdfl", "tyqcpfvorznmxxdzsnkjhvabtzucyooctzzrgehlsuyinrrnzjilfpalvqgwoey", "tyqcpfvorznmxxdzsnkjn"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjn", "tyqcpfvorznmxxdzsnkjnrfmy", "tyqcpfvorznmxxdzsnkjnrkjelwoqorxsnyjqdnxfava"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrfmy", "tyqcpfvorznmxxdzsnkjnrkjelwoqorxsnyjqdnxfava", "tyqcpfvorznmxxdzsnkjnrrumaqtylptffsjzygeumkahutdmalkqtrhtgrsrqcyyti"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrumaqtylptffsjzygeumkahutdmalkqtrhtgrsrqcyyti", "tyqcpfvorznmxxdzsnkjnrrzpdqanmxattjhgnflnoyynevsxvpbwfmfrnlc", "tyqcpfvorznmxxdzsnkjnrrzpewgvvnicz"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpdqanmxattjhgnflnoyynevsxvpbwfmfrnlc", "tyqcpfvorznmxxdzsnkjnrrzpewgvvnicz", "tyqcpfvorznmxxdzsnkjnrrzpfgkeduq"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpdqanmxattjhgnflnoyynevsxvpbwfmfrnlc", "tyqcpfvorznmxxdzsnkjnrrzpewgvvnicz", "tyqcpfvorznmxxdzsnkjnrrzpfgkeduq"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgkeduq", "tyqcpfvorznmxxdzsnkjnrrzpfgkhdwienfhpsqbyrvotbgchkkmvk", "tyqcpfvorznmxxdzsnkjnrrzpfgknjxnepksgdzwxsbziwdzsiiyarxhtpp"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgkeduq", "tyqcpfvorznmxxdzsnkjnrrzpfgkhdwienfhpsqbyrvotbgchkkmvk", "tyqcpfvorznmxxdzsnkjnrrzpfgknjxnepksgdzwxsbziwdzsiiyarxhtpp"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgkeduq", "tyqcpfvorznmxxdzsnkjnrrzpfgkhdwienfhpsqbyrvotbgchkkmvk", "tyqcpfvorznmxxdzsnkjnrrzpfgknjxnepksgdzwxsbziwdzsiiyarxhtpp"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknjxnepksgdzwxsbziwdzsiiyarxhtpp", "tyqcpfvorznmxxdzsnkjnrrzpfgknvfnzshqqfpr", "tyqcpfvorznmxxdzsnkjnrrzpfgknvnlxdokehsjhiohwdeyikeajzipztzhwmxc"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvfnzshqqfpr", "tyqcpfvorznmxxdzsnkjnrrzpfgknvnlxdokehsjhiohwdeyikeajzipztzhwmxc", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqorqffebhoyfvgkspenqpcmvoxpybkjg"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqorqffebhoyfvgkspenqpcmvoxpybkjg", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqqngbpbdtufkgunalbekxbkpajlgbjtqmswh", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckohyof"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckohyof", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckoktdj", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzakckmtmjxx"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckohyof", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckoktdj", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzakckmtmjxx"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckohyof", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckoktdj", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzakckmtmjxx"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckohyof", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckoktdj", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzakckmtmjxx"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckohyof", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckoktdj", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzakckmtmjxx"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckohyof", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckoktdj", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzakckmtmjxx"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzakckmtmjxx", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqandxbuvshebs", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejemb"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzakckmtmjxx", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqandxbuvshebs", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejemb"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqandxbuvshebs", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejemb", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetaoqgbczdcemzlmqemy"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqandxbuvshebs", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejemb", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetaoqgbczdcemzlmqemy"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqandxbuvshebs", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejemb", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetaoqgbczdcemzlmqemy"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqandxbuvshebs", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejemb", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetaoqgbczdcemzlmqemy"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqandxbuvshebs", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejemb", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetaoqgbczdcemzlmqemy"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqandxbuvshebs", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejemb", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetaoqgbczdcemzlmqemy"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejemb", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetaoqgbczdcemzlmqemy", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbfmryrbgicgzqecje"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejemb", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetaoqgbczdcemzlmqemy", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbfmryrbgicgzqecje"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejemb", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetaoqgbczdcemzlmqemy", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbfmryrbgicgzqecje"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetaoqgbczdcemzlmqemy", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbfmryrbgicgzqecje", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnccdnakfkhtg"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbfmryrbgicgzqecje", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnccdnakfkhtg", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbneryahanhrhkal"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnccdnakfkhtg", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbneryahanhrhkal", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnubpoqoghhgbpew"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnubpoqoghhgbpew", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnudxocavmwpggka", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnunflh"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnunflh", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniaymgkdduoabmp", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwcpoxr"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniaymgkdduoabmp", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwcpoxr", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwghy"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwcpoxr", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwghy", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwreznx"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchidnpt", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchviaxsw", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchvie"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchidnpt", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchviaxsw", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchvie"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchidnpt", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchviaxsw", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchvie"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchidnpt", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchviaxsw", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchvie"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchidnpt", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchviaxsw", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchvie"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchidnpt", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchviaxsw", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchvie"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchviaxsw", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchvie", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchvigzpo"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchviaxsw", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchvie", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchvigzpo"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchviob", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchviof", "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchvioncnr"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchviotvqi"));
        expected.add(List.of("tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchviotvqi"));
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        expected.add(Collections.emptyList());
        assertEquals(expected, result);
    }
}