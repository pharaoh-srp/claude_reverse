package defpackage;

import com.anthropic.claude.sessions.types.AskUserQuestionQuestion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes2.dex */
public final class tw0 {
    public final awc a;
    public final qy3 b;
    public final l14 c;
    public final List d;
    public final isc e;
    public final lsc f;
    public final lsc g;

    public tw0(awc awcVar, qy3 qy3Var, l14 l14Var, int i, Map map, Map map2) {
        awcVar.getClass();
        map2.getClass();
        this.a = awcVar;
        this.b = qy3Var;
        this.c = l14Var;
        this.d = awcVar.c.getQuestions();
        this.e = new isc(i);
        this.f = mpk.P(map);
        this.g = mpk.P(map2);
    }

    public final void a() {
        isc iscVar = this.e;
        int iH = iscVar.h();
        List<AskUserQuestionQuestion> list = this.d;
        if (iH != list.size() - 1) {
            iscVar.i(iscVar.h() + 1);
            this.c.a();
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AskUserQuestionQuestion askUserQuestionQuestion : list) {
            Object obj = f().get(askUserQuestionQuestion.getQuestion());
            String str = (String) e().get(askUserQuestionQuestion.getQuestion());
            if (obj instanceof String) {
                if (!obj.equals("__OTHER__") || str == null || bsg.I0(str)) {
                    str = (String) obj;
                }
                String question = askUserQuestionQuestion.getQuestion();
                JsonPrimitive jsonPrimitiveC = ch9.c(str);
                question.getClass();
                jsonPrimitiveC.getClass();
            } else if (obj instanceof List) {
                List<String> list2 = (List) obj;
                ArrayList arrayList = new ArrayList(x44.y(list2, 10));
                for (String str2 : list2) {
                    if (x44.r(str2, "__OTHER__") && str != null && !bsg.I0(str)) {
                        str2 = str;
                    }
                    arrayList.add(str2);
                }
                String question2 = askUserQuestionQuestion.getQuestion();
                ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(ch9.c((String) it.next()));
                }
                JsonArray jsonArray = new JsonArray(arrayList2);
                question2.getClass();
            } else {
                String question3 = askUserQuestionQuestion.getQuestion();
                JsonPrimitive jsonPrimitiveC2 = ch9.c("");
                question3.getClass();
                jsonPrimitiveC2.getClass();
            }
        }
        JsonObject jsonObject = new JsonObject(linkedHashMap);
        ag9 ag9Var = bg9.d;
        uo0 uo0VarT = d4c.t(AskUserQuestionQuestion.Companion.serializer());
        ag9Var.getClass();
        this.b.invoke(this.a.b, sta.h0(new cpc("questions", v40.S(ag9Var, list, uo0VarT)), new cpc("answers", jsonObject)));
    }

    public final String b() {
        String str;
        AskUserQuestionQuestion askUserQuestionQuestionC = c();
        return (askUserQuestionQuestionC == null || (str = (String) e().get(askUserQuestionQuestionC.getQuestion())) == null) ? "" : str;
    }

    public final AskUserQuestionQuestion c() {
        return (AskUserQuestionQuestion) w44.O0(this.e.h(), this.d);
    }

    public final boolean d() {
        Object obj;
        AskUserQuestionQuestion askUserQuestionQuestionC = c();
        if (askUserQuestionQuestionC == null || (obj = f().get(askUserQuestionQuestionC.getQuestion())) == null) {
            return false;
        }
        if (obj instanceof String) {
            return obj.equals("__OTHER__") ? !bsg.I0(b()) : ((CharSequence) obj).length() > 0;
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (!x44.r(it.next(), "__OTHER__")) {
                        break;
                    }
                }
            }
            if (((List) obj).contains("__OTHER__") && !bsg.I0(b())) {
                return true;
            }
        }
        return false;
    }

    public final Map e() {
        return (Map) this.g.getValue();
    }

    public final Map f() {
        return (Map) this.f.getValue();
    }

    public final void g(String str) {
        str.getClass();
        AskUserQuestionQuestion askUserQuestionQuestionC = c();
        if (askUserQuestionQuestionC == null) {
            return;
        }
        boolean zR = x44.r(f().get(askUserQuestionQuestionC.getQuestion()), str);
        lsc lscVar = this.f;
        if (zR) {
            lscVar.setValue(sta.i0(askUserQuestionQuestionC.getQuestion(), f()));
        } else {
            lscVar.setValue(sta.m0(f(), new cpc(askUserQuestionQuestionC.getQuestion(), str)));
        }
        this.c.a();
    }

    public final void h(String str) {
        str.getClass();
        AskUserQuestionQuestion askUserQuestionQuestionC = c();
        if (askUserQuestionQuestionC == null) {
            return;
        }
        Object obj = f().get(askUserQuestionQuestionC.getQuestion());
        List list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            list = lm6.E;
        }
        this.f.setValue(sta.m0(f(), new cpc(askUserQuestionQuestionC.getQuestion(), list.contains(str) ? w44.X0(list, str) : w44.b1(list, str))));
        this.c.a();
    }
}
