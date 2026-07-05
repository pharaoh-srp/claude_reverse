package defpackage;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes2.dex */
public class ri0 {
    public static final Class[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};
    public static final int[] e = {R.attr.accessibilityPaneTitle};
    public static final int[] f = {R.attr.screenReaderFocusable};
    public static final String[] g = {"android.widget.", "android.view.", "android.webkit."};
    public static final w6g h = new w6g(0);
    public final Object[] a = new Object[2];

    public hg0 a(Context context, AttributeSet attributeSet) {
        return new hg0(context, attributeSet, com.anthropic.claude.R.attr.autoCompleteTextViewStyle);
    }

    public jg0 b(Context context, AttributeSet attributeSet) {
        return new jg0(context, attributeSet, com.anthropic.claude.R.attr.buttonStyle);
    }

    public kg0 c(Context context, AttributeSet attributeSet) {
        return new kg0(context, attributeSet);
    }

    public kh0 d(Context context, AttributeSet attributeSet) {
        return new kh0(context, attributeSet);
    }

    public ji0 e(Context context, AttributeSet attributeSet) {
        return new ji0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String strConcat;
        w6g w6gVar = h;
        Constructor constructor = (Constructor) w6gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            w6gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }
}
