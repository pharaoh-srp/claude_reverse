package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum tyg {
    CONTEXT_WINDOW_LENGTH("11647753"),
    TRUST_AND_SAFETY_APPEALS("8241253"),
    SUICIDE_AND_SELF_HARM("8106465"),
    INCORRECT_RESPONSES("8525154"),
    /* JADX INFO: Fake field, exist only in values array */
    USAGE_LIMIT_BEST_PRACTICES("9797557"),
    UNDERSTANDING_PERSONALIZATION("10185728"),
    HOW_MEMORY_WORKS("11817273"),
    MINIMUM_AGE_REQUIREMENT("13117299"),
    CRISIS_HELPLINE_SUPPORT("13171706"),
    MESSAGE_LIMITS("11647753"),
    CLAUDE_PRO_USAGE("9797557"),
    CLAUDE_MAX_USAGE("9797557"),
    INSTALLING_CLAUDE_DESKTOP("10065433"),
    USE_COWORK_SAFELY("13364135"),
    REAL_TIME_SAFEGUARDS("15363606");

    public final String E;

    tyg(String str) {
        this.E = str;
    }

    public final String a() {
        return "https://support.claude.com/articles/".concat(this.E);
    }
}
