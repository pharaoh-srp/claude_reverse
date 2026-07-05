package com.anthropic.claude.deeplink;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.anthropic.claude.analytics.events.WidgetEvents$OpenAppViaShortcut;
import com.anthropic.claude.analytics.events.WidgetEvents$ShortcutType;
import com.anthropic.claude.mainactivity.MainActivity;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.ap5;
import defpackage.ba4;
import defpackage.iuj;
import defpackage.j5g;
import defpackage.kw9;
import defpackage.mq5;
import defpackage.n30;
import defpackage.o4;
import defpackage.qi3;
import defpackage.sfa;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.yfa;
import defpackage.zfa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class DeepLinkActivity extends ba4 {
    public final kw9 Z = yb5.w(w1a.E, new o4(5, this));

    public static void o(Intent intent) {
        intent.removeFlags(134217728);
        intent.removeFlags(524288);
        intent.removeFlags(FreeTypeConstants.FT_LOAD_MONOCHROME);
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        intent.addFlags(536870912);
    }

    @Override // defpackage.ba4, defpackage.aa4, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        Object next;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("EXTRA_SHORTCUT_TYPE");
        if (stringExtra != null) {
            j5g.F.getClass();
            Iterator<E> it = j5g.J.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((j5g) next).E.equals(stringExtra)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            j5g j5gVar = (j5g) next;
            int i = j5gVar == null ? -1 : ap5.a[j5gVar.ordinal()];
            kw9 kw9Var = this.Z;
            if (i == 1) {
                String stringExtra2 = getIntent().getStringExtra("com.anthropic.claude.intent.extra.CHAT_ID");
                String stringExtra3 = getIntent().getStringExtra("com.anthropic.claude.intent.extra.ARTIFACT_IDENTIFIER");
                ((qi3) kw9Var.getValue()).e(new WidgetEvents$OpenAppViaShortcut(WidgetEvents$ShortcutType.ARTIFACT_IN_CHAT, stringExtra2, stringExtra3), WidgetEvents$OpenAppViaShortcut.Companion.serializer());
                Intent intent2 = new Intent(this, (Class<?>) MainActivity.class);
                o(intent2);
                if (stringExtra2 != null) {
                    intent2.putExtra("com.anthropic.claude.intent.extra.CHAT_ID", stringExtra2);
                }
                if (stringExtra3 != null) {
                    intent2.putExtra("com.anthropic.claude.intent.extra.ARTIFACT_IDENTIFIER", stringExtra3);
                }
                intent = intent2;
            } else if (i != 2) {
                zfa.a.getClass();
                if (yfa.b()) {
                    String strE = iuj.E(this);
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj)).getClass();
                        arrayList.add(obj);
                    }
                    if (!arrayList.isEmpty()) {
                        zfa.a.getClass();
                        String str = "Unsupported shortcut type " + j5gVar;
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((n30) ((zfa) it2.next())).b(sfa.ERROR, strE, str);
                        }
                    }
                }
                ((qi3) kw9Var.getValue()).e(new WidgetEvents$OpenAppViaShortcut(WidgetEvents$ShortcutType.UNSPECIFIED, (String) null, (String) null, 6, (mq5) null), WidgetEvents$OpenAppViaShortcut.Companion.serializer());
                intent = new Intent(this, (Class<?>) MainActivity.class);
                o(intent);
            } else {
                String stringExtra4 = getIntent().getStringExtra("com.anthropic.claude.intent.extra.CHAT_ID");
                ((qi3) kw9Var.getValue()).e(new WidgetEvents$OpenAppViaShortcut(WidgetEvents$ShortcutType.CHAT, stringExtra4, (String) null, 4, (mq5) null), WidgetEvents$OpenAppViaShortcut.Companion.serializer());
                intent = new Intent(this, (Class<?>) MainActivity.class);
                o(intent);
                if (stringExtra4 != null) {
                    intent.putExtra("com.anthropic.claude.intent.extra.CHAT_ID", stringExtra4);
                }
            }
        } else {
            intent = new Intent(getIntent());
            intent.setComponent(new ComponentName(this, (Class<?>) MainActivity.class));
            o(intent);
        }
        startActivity(intent);
        finish();
    }

    @Override // defpackage.ba4, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Intent intent2 = new Intent(getIntent());
        intent2.setComponent(new ComponentName(this, (Class<?>) MainActivity.class));
        o(intent2);
        startActivity(intent2);
        finish();
    }
}
