package org.chromium.support_lib_boundary;

import android.content.Context;
import android.webkit.WebView;
import defpackage.ij0;
import defpackage.sz6;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public interface WebViewBuilderBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Baseline {
        public static final int DEFAULT = 0;
    }

    public static class Config implements Consumer<BiConsumer<Integer, Object>> {
        public String profileName;
        public boolean restrictJavascriptInterface;
        public int baseline = 0;
        public final ArrayList a = new ArrayList();
        public final LinkedHashMap b = new LinkedHashMap();
        public final ArrayList c = new ArrayList();

        @Override // java.util.function.Consumer
        public void accept(BiConsumer<Integer, Object> biConsumer) {
            biConsumer.accept(0, Integer.valueOf(this.baseline));
            biConsumer.accept(2, Boolean.valueOf(this.restrictJavascriptInterface));
            biConsumer.accept(1, new Object[]{this.a, new ArrayList(this.b.keySet()), this.c});
            if (this.profileName != null) {
                biConsumer.accept(3, this.profileName);
            }
        }

        public void addJavascriptInterface(Object obj, String str, List<String> list) {
            LinkedHashMap linkedHashMap = this.b;
            if (linkedHashMap.containsKey(str)) {
                sz6.p(ij0.j("A duplicate JavaScript interface was provided for \"", str, "\""));
                return;
            }
            this.a.add(obj);
            linkedHashMap.put(str, Boolean.TRUE);
            this.c.add(list);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConfigField {
        public static final int BASELINE = 0;
        public static final int JAVASCRIPT_INTERFACE = 1;
        public static final int PROFILE_NAME = 3;
        public static final int RESTRICT_JAVASCRIPT_INTERFACE = 2;
    }

    void applyTo(WebView webView, Consumer<BiConsumer<Integer, Object>> consumer);

    WebView build(Context context, Consumer<BiConsumer<Integer, Object>> consumer);
}
