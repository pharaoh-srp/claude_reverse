package defpackage;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import com.anthropic.claude.R;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ae0 {
    public static Typeface a;
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final Paint c = new Paint();

    public static Typeface a(Resources resources, int i) {
        Typeface typeface;
        resources.getClass();
        ConcurrentHashMap concurrentHashMap = b;
        Typeface typeface2 = (Typeface) concurrentHashMap.get(Integer.valueOf(i));
        if (typeface2 != null) {
            return typeface2;
        }
        Paint paint = c;
        synchronized (paint) {
            try {
                Integer numValueOf = Integer.valueOf(i);
                Object obj = concurrentHashMap.get(numValueOf);
                if (obj == null) {
                    Typeface font = a;
                    if (font == null) {
                        font = resources.getFont(R.font.anthropicon_symbols);
                        a = font;
                        font.getClass();
                    }
                    paint.setTypeface(font);
                    paint.setFontVariationSettings("'wght' 400, 'opsz' " + i);
                    Typeface typeface3 = paint.getTypeface();
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, typeface3);
                    obj = objPutIfAbsent == null ? typeface3 : objPutIfAbsent;
                }
                typeface = (Typeface) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        typeface.getClass();
        return typeface;
    }
}
