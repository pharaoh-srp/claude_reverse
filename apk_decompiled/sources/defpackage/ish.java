package defpackage;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ish {
    public static final yl4 F;
    public static final LinkedHashMap G;
    public static final /* synthetic */ ish[] H;
    public static final /* synthetic */ gq6 I;
    public final int E;

    static {
        ish[] ishVarArr = {new ish("UNKNOWN", 0, 0), new ish("KEYWORD", 1, 1), new ish("STRING", 2, 2), new ish("COMMENT", 3, 3), new ish("NUMBER", 4, 4), new ish("LITERAL", 5, 5), new ish("BUILT_IN", 6, 6), new ish(CredentialProviderBaseController.TYPE_TAG, 7, 7), new ish("FUNCTION", 8, 8), new ish("TITLE", 9, 9), new ish("PARAMS", 10, 10), new ish("VARIABLE", 11, 11), new ish("ATTR", 12, 12), new ish("ATTRIBUTE", 13, 13), new ish("META", 14, 14), new ish("OPERATOR", 15, 15), new ish("PUNCTUATION", 16, 16), new ish("REGEXP", 17, 17), new ish("SYMBOL", 18, 18), new ish("CLASS", 19, 19), new ish("PROPERTY", 20, 20), new ish("DOCTAG", 21, 21), new ish("TEMPLATE_TAG", 22, 22), new ish("TEMPLATE_VARIABLE", 23, 23), new ish("SUBST", 24, 24), new ish("SECTION", 25, 25), new ish("SELECTOR_TAG", 26, 26), new ish("SELECTOR_ID", 27, 27), new ish("SELECTOR_CLASS", 28, 28), new ish("TAG", 29, 29), new ish("NAME", 30, 30), new ish("ADDITION", 31, 31), new ish("DELETION", 32, 32), new ish("EMPHASIS", 33, 33), new ish("STRONG", 34, 34), new ish("LINK", 35, 35), new ish("QUOTE", 36, 36), new ish("CODE", 37, 37), new ish("BULLET", 38, 38), new ish("FORMULA", 39, 39), new ish("CHAR", 40, 40), new ish("CHAR_ESCAPE", 41, 41)};
        H = ishVarArr;
        gq6 gq6Var = new gq6(ishVarArr);
        I = gq6Var;
        F = new yl4();
        int iD0 = tta.d0(x44.y(gq6Var, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0 < 16 ? 16 : iD0);
        for (Object obj : gq6Var) {
            linkedHashMap.put(Integer.valueOf(((ish) obj).E), obj);
        }
        G = linkedHashMap;
    }

    public ish(String str, int i, int i2) {
        this.E = i2;
    }

    public static ish valueOf(String str) {
        return (ish) Enum.valueOf(ish.class, str);
    }

    public static ish[] values() {
        return (ish[]) H.clone();
    }
}
