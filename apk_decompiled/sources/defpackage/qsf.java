package defpackage;

import com.anthropic.claude.code.ui.PendingAskUserQuestionSelections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class qsf {
    public final String a;
    public final List b;
    public final PendingAskUserQuestionSelections c;
    public final Map d;

    static {
        cwc cwcVar = PendingAskUserQuestionSelections.Companion;
    }

    public qsf(String str, List list, PendingAskUserQuestionSelections pendingAskUserQuestionSelections, Map map) {
        str.getClass();
        list.getClass();
        map.getClass();
        this.a = str;
        this.b = list;
        this.c = pendingAskUserQuestionSelections;
        this.d = map;
    }

    public static qsf a(qsf qsfVar, List list, PendingAskUserQuestionSelections pendingAskUserQuestionSelections, Map map, int i) {
        String str = qsfVar.a;
        if ((i & 2) != 0) {
            list = qsfVar.b;
        }
        if ((i & 4) != 0) {
            pendingAskUserQuestionSelections = qsfVar.c;
        }
        if ((i & 8) != 0) {
            map = qsfVar.d;
        }
        qsfVar.getClass();
        str.getClass();
        list.getClass();
        map.getClass();
        return new qsf(str, list, pendingAskUserQuestionSelections, map);
    }

    public final List b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final PendingAskUserQuestionSelections d() {
        return this.c;
    }

    public final Map e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsf)) {
            return false;
        }
        qsf qsfVar = (qsf) obj;
        return x44.r(this.a, qsfVar.a) && x44.r(this.b, qsfVar.b) && x44.r(this.c, qsfVar.c) && x44.r(this.d, qsfVar.d);
    }

    public final int hashCode() {
        int iM = kgh.m(this.a.hashCode() * 31, 31, this.b);
        PendingAskUserQuestionSelections pendingAskUserQuestionSelections = this.c;
        return this.d.hashCode() + ((iM + (pendingAskUserQuestionSelections == null ? 0 : pendingAskUserQuestionSelections.hashCode())) * 31);
    }

    public final String toString() {
        return "SessionInputState(inputText=" + this.a + ", comments=" + this.b + ", pendingAskUserQuestionSelections=" + this.c + ", submittedAskUserQuestionAnswers=" + this.d + ")";
    }

    public /* synthetic */ qsf() {
        this("", lm6.E, null, nm6.E);
    }
}
