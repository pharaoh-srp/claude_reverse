package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nt9 {
    public static final ide a = new ide("(\\$\\w+!?)?\\$?[A-Z]+\\$?[0-9]+(:(\\$\\w+!?)?\\$?[A-Z]+\\$?[0-9]+)?");

    public static boolean a(int i, String str) {
        int i2 = 0;
        for (int i3 = i - 1; i3 >= 0 && str.charAt(i3) == '\\'; i3--) {
            i2++;
        }
        return i2 % 2 == 1;
    }
}
