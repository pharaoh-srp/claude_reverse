package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.security.identity.IdentityCredential;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.ads.GooglePlayReferrer;
import com.anthropic.claude.analytics.events.CodeEvents$CodeMessagePerceivedTTFT;
import com.anthropic.claude.analytics.events.CodeEvents$CodeSessionInitBreakdown;
import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.bell.tts.f;
import com.anthropic.claude.conway.protocol.x;
import com.anthropic.claude.core.telemetry.SilentException;
import com.google.android.gms.internal.measurement.k0;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Signature;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDateTime;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public final class c61 implements sr9, tr9, dxg, ns, see {
    public final /* synthetic */ int E;
    public Object F;
    public Object G;
    public Object H;
    public Object I;

    public c61(o7c o7cVar) {
        ArrayList<uzc> arrayList;
        int i;
        ArrayList arrayList2;
        String str;
        Bundle[] bundleArr;
        int i2;
        ArrayList arrayList3;
        k7c k7cVarE;
        this.E = 17;
        this.I = new Bundle();
        this.H = o7cVar;
        Context context = o7cVar.a;
        ArrayList arrayList4 = o7cVar.B;
        ArrayList<uzc> arrayList5 = o7cVar.c;
        ArrayList arrayList6 = o7cVar.d;
        this.F = context;
        Notification.Builder builder = new Notification.Builder(context, o7cVar.v);
        this.G = builder;
        Notification notification = o7cVar.z;
        Resources resources = null;
        int i3 = 2;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(o7cVar.e).setContentText(o7cVar.f).setContentInfo(null).setContentIntent(o7cVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0).setNumber(o7cVar.i).setProgress(0, 0, false);
        IconCompat iconCompat = o7cVar.h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.f(context));
        builder.setSubText(null).setUsesChronometer(o7cVar.l).setPriority(o7cVar.j);
        f8c f8cVar = o7cVar.m;
        if (f8cVar instanceof r7c) {
            r7c r7cVar = (r7c) f8cVar;
            PendingIntent pendingIntent = r7cVar.h;
            Integer num = r7cVar.l;
            k7c k7cVarE2 = pendingIntent == null ? r7cVar.e(R.drawable.ic_call_decline, R.string.call_notification_hang_up_action, num, R.color.call_notification_decline_color, r7cVar.i) : r7cVar.e(R.drawable.ic_call_decline, R.string.call_notification_decline_action, num, R.color.call_notification_decline_color, pendingIntent);
            PendingIntent pendingIntent2 = r7cVar.g;
            if (pendingIntent2 == null) {
                k7cVarE = null;
            } else {
                boolean z = r7cVar.j;
                k7cVarE = r7cVar.e(z ? R.drawable.ic_call_answer_video : R.drawable.ic_call_answer, z ? R.string.call_notification_answer_video_action : R.string.call_notification_answer_action, r7cVar.k, R.color.call_notification_answer_color, pendingIntent2);
            }
            ArrayList arrayList7 = new ArrayList(3);
            arrayList7.add(k7cVarE2);
            ArrayList<k7c> arrayList8 = r7cVar.a.b;
            if (arrayList8 != null) {
                for (k7c k7cVar : arrayList8) {
                    if (k7cVar.g) {
                        arrayList7.add(k7cVar);
                    } else if (!k7cVar.a.getBoolean("key_action_priority")) {
                        arrayList7.add(k7cVar);
                        i3--;
                    }
                    if (k7cVarE != null && i3 == 1) {
                        arrayList7.add(k7cVarE);
                        i3--;
                    }
                }
            }
            if (k7cVarE != null && i3 >= 1) {
                arrayList7.add(k7cVarE);
            }
            Iterator it = arrayList7.iterator();
            while (it.hasNext()) {
                e((k7c) it.next());
            }
        } else {
            Iterator it2 = o7cVar.b.iterator();
            while (it2.hasNext()) {
                e((k7c) it2.next());
            }
        }
        Bundle bundle = o7cVar.r;
        if (bundle != null) {
            ((Bundle) this.I).putAll(bundle);
        }
        ((Notification.Builder) this.G).setShowWhen(o7cVar.k);
        ((Notification.Builder) this.G).setLocalOnly(o7cVar.n);
        ((Notification.Builder) this.G).setGroup(null);
        ((Notification.Builder) this.G).setSortKey(null);
        ((Notification.Builder) this.G).setGroupSummary(false);
        ((Notification.Builder) this.G).setCategory(o7cVar.q);
        ((Notification.Builder) this.G).setColor(o7cVar.s);
        ((Notification.Builder) this.G).setVisibility(o7cVar.t);
        ((Notification.Builder) this.G).setPublicVersion(null);
        ((Notification.Builder) this.G).setSound(notification.sound, notification.audioAttributes);
        String str2 = "";
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList5 == null) {
                arrayList3 = null;
            } else {
                arrayList3 = new ArrayList(arrayList5.size());
                for (uzc uzcVar : arrayList5) {
                    CharSequence charSequence = uzcVar.a;
                    String str3 = uzcVar.c;
                    if (str3 == null) {
                        str3 = charSequence != null ? "name:" + ((Object) charSequence) : "";
                    }
                    arrayList3.add(str3);
                }
            }
            if (arrayList3 != null) {
                if (arrayList4 == null) {
                    arrayList4 = arrayList3;
                } else {
                    ip0 ip0Var = new ip0(arrayList4.size() + arrayList3.size());
                    ip0Var.addAll(arrayList3);
                    ip0Var.addAll(arrayList4);
                    arrayList4 = new ArrayList(ip0Var);
                }
            }
        }
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                ((Notification.Builder) this.G).addPerson((String) it3.next());
            }
        }
        if (arrayList6.size() > 0) {
            if (o7cVar.r == null) {
                o7cVar.r = new Bundle();
            }
            Bundle bundle2 = o7cVar.r.getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            int i4 = 0;
            while (i4 < arrayList6.size()) {
                String string = Integer.toString(i4);
                k7c k7cVar2 = (k7c) arrayList6.get(i4);
                Bundle bundle5 = new Bundle();
                if (k7cVar2.b == null && (i2 = k7cVar2.h) != 0) {
                    k7cVar2.b = IconCompat.c(resources, str2, i2);
                }
                IconCompat iconCompat2 = k7cVar2.b;
                Bundle bundle6 = k7cVar2.a;
                ArrayList arrayList9 = arrayList5;
                bundle5.putInt("icon", iconCompat2 != null ? iconCompat2.d() : 0);
                bundle5.putCharSequence("title", k7cVar2.i);
                bundle5.putParcelable("actionIntent", k7cVar2.j);
                Bundle bundle7 = bundle6 != null ? new Bundle(bundle6) : new Bundle();
                bundle7.putBoolean("android.support.allowGeneratedReplies", k7cVar2.d);
                bundle5.putBundle("extras", bundle7);
                bfe[] bfeVarArr = k7cVar2.c;
                if (bfeVarArr == null) {
                    arrayList2 = arrayList6;
                    str = str2;
                    bundleArr = null;
                } else {
                    Bundle[] bundleArr2 = new Bundle[bfeVarArr.length];
                    arrayList2 = arrayList6;
                    str = str2;
                    int i5 = 0;
                    while (i5 < bfeVarArr.length) {
                        bfe bfeVar = bfeVarArr[i5];
                        bfe[] bfeVarArr2 = bfeVarArr;
                        Bundle bundle8 = new Bundle();
                        int i6 = i5;
                        Bundle[] bundleArr3 = bundleArr2;
                        bundle8.putString("resultKey", bfeVar.a);
                        bundle8.putCharSequence("label", bfeVar.b);
                        bundle8.putCharSequenceArray("choices", bfeVar.c);
                        bundle8.putBoolean("allowFreeFormInput", bfeVar.d);
                        bundle8.putBundle("extras", bfeVar.f);
                        Set set = bfeVar.g;
                        if (set != null && !set.isEmpty()) {
                            ArrayList<String> arrayList10 = new ArrayList<>(set.size());
                            Iterator it4 = set.iterator();
                            while (it4.hasNext()) {
                                arrayList10.add((String) it4.next());
                            }
                            bundle8.putStringArrayList("allowedDataTypes", arrayList10);
                        }
                        bundleArr3[i6] = bundle8;
                        i5 = i6 + 1;
                        bfeVarArr = bfeVarArr2;
                        bundleArr2 = bundleArr3;
                    }
                    bundleArr = bundleArr2;
                }
                bundle5.putParcelableArray("remoteInputs", bundleArr);
                bundle5.putBoolean("showsUserInterface", k7cVar2.e);
                bundle5.putInt("semanticAction", k7cVar2.f);
                bundle4.putBundle(string, bundle5);
                i4++;
                arrayList5 = arrayList9;
                arrayList6 = arrayList2;
                str2 = str;
                resources = null;
            }
            arrayList = arrayList5;
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            if (o7cVar.r == null) {
                o7cVar.r = new Bundle();
            }
            o7cVar.r.putBundle("android.car.EXTENSIONS", bundle2);
            ((Bundle) this.I).putBundle("android.car.EXTENSIONS", bundle3);
        } else {
            arrayList = arrayList5;
        }
        ((Notification.Builder) this.G).setExtras(o7cVar.r);
        ((Notification.Builder) this.G).setRemoteInputHistory(null);
        RemoteViews remoteViews = o7cVar.u;
        if (remoteViews != null) {
            ((Notification.Builder) this.G).setCustomBigContentView(remoteViews);
        }
        ((Notification.Builder) this.G).setBadgeIconType(0);
        ((Notification.Builder) this.G).setSettingsText(null);
        ((Notification.Builder) this.G).setShortcutId(null);
        ((Notification.Builder) this.G).setTimeoutAfter(o7cVar.w);
        ((Notification.Builder) this.G).setGroupAlertBehavior(0);
        if (o7cVar.p) {
            ((Notification.Builder) this.G).setColorized(o7cVar.o);
        }
        if (!TextUtils.isEmpty(o7cVar.v)) {
            ((Notification.Builder) this.G).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            for (uzc uzcVar2 : arrayList) {
                Notification.Builder builder2 = (Notification.Builder) this.G;
                uzcVar2.getClass();
                ke0.a(builder2, ke0.q(uzcVar2));
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            le0.n((Notification.Builder) this.G, o7cVar.y);
            le0.p((Notification.Builder) this.G);
        }
        if (i7 >= 31 && (i = o7cVar.x) != 0) {
            oe0.l((Notification.Builder) this.G, i);
        }
        if (i7 >= 36) {
            e6.f((Notification.Builder) this.G);
        }
        if (o7cVar.A) {
            ((o7c) this.H).getClass();
            ((Notification.Builder) this.G).setVibrate(null);
            ((Notification.Builder) this.G).setSound(null);
            int i8 = notification.defaults & (-4);
            notification.defaults = i8;
            ((Notification.Builder) this.G).setDefaults(i8);
            ((o7c) this.H).getClass();
            if (TextUtils.isEmpty(null)) {
                ((Notification.Builder) this.G).setGroup("silent");
            }
            ((Notification.Builder) this.G).setGroupAlertBehavior(1);
        }
    }

    public static final jie c(c61 c61Var, String str) {
        jie jieVar = new jie();
        jieVar.g(str);
        for (Map.Entry entry : ((Map) c61Var.G).entrySet()) {
            jieVar.a((String) entry.getKey(), (String) entry.getValue());
        }
        return jieVar;
    }

    public static final String d(c61 c61Var, String... strArr) {
        String str = (String) c61Var.F;
        str.getClass();
        us8 us8Var = new us8();
        us8Var.h(null, str);
        us8 us8VarF = us8Var.c().f();
        for (String str2 : strArr) {
            us8VarF.a(str2);
        }
        return us8VarF.c().i;
    }

    public boolean A(ob obVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.F).onActionItemClicked(p(obVar), new gdb((Context) this.G, (yyg) menuItem));
    }

    public void B() {
        g8d g8dVar = (g8d) this.I;
        if (((f8d) this.G) == f8d.F) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 0);
            motionEventObtain.setSource(0);
            g8dVar.c().invoke(motionEventObtain);
            motionEventObtain.recycle();
            this.G = f8d.E;
            g8dVar.G = false;
            this.H = null;
        }
    }

    public boolean C(ob obVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.F;
        syg sygVarP = p(obVar);
        w6g w6gVar = (w6g) this.I;
        Menu zdbVar = (Menu) w6gVar.get(menu);
        if (zdbVar == null) {
            zdbVar = new zdb((Context) this.G, (vcb) menu);
            w6gVar.put(menu, zdbVar);
        }
        return callback.onCreateActionMode(sygVarP, zdbVar);
    }

    public void D(int i) {
        o5l o5lVar = (o5l) this.F;
        l45 l45Var = (l45) this.I;
        z9e z9eVar = (z9e) this.H;
        ua2 ua2Var = (ua2) this.G;
        try {
            if (i == 0) {
                Bundle bundle = (Bundle) o5lVar.d().F;
                String string = bundle.getString("install_referrer");
                string.getClass();
                GooglePlayReferrer googlePlayReferrer = new GooglePlayReferrer(string, bundle.getLong("referrer_click_timestamp_seconds"), bundle.getLong("install_begin_timestamp_seconds"), bundle.getLong("referrer_click_timestamp_server_seconds"), bundle.getLong("install_begin_timestamp_server_seconds"));
                List list = xah.a;
                xah.e(6, "Google Play Install Referrer: Ok", null, null);
                ix5.n(ua2Var, z9eVar, googlePlayReferrer);
            } else if (i == 1) {
                ix5.d(l45Var, "API unavailable");
                ix5.n(ua2Var, z9eVar, null);
            } else if (i == 2) {
                ix5.d(l45Var, "API not supported");
                ix5.n(ua2Var, z9eVar, null);
            }
            o5lVar.F = 3;
            if (((v59) o5lVar.I) != null) {
                wvk.j("Unbinding from service.");
                ((Context) o5lVar.G).unbindService((v59) o5lVar.I);
                o5lVar.I = null;
            }
            o5lVar.H = null;
        } catch (Exception e) {
            SilentException.a(new SilentException("Error reading Google Play Referrer details", e), null, false, 3);
            ix5.n(ua2Var, z9eVar, null);
        }
    }

    public void E(t7d t7dVar, u7d u7dVar) {
        boolean z;
        boolean z2;
        boolean z3;
        g8d g8dVar = (g8d) this.I;
        List list = t7dVar.a;
        List list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            z7d z7dVar = (z7d) list.get(i);
            if (hvj.h(z7dVar) || hvj.j(z7dVar)) {
                z = false;
                break;
            }
        }
        z = true;
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((z7d) list.get(i2)).l()) {
                z2 = false;
                break;
            }
        }
        z2 = true;
        if (g8dVar.G) {
            z3 = true;
        } else {
            int size3 = list2.size();
            int i3 = 0;
            while (true) {
                if (i3 < size3) {
                    z7d z7dVar2 = (z7d) list.get(i3);
                    if (hvj.h(z7dVar2) || hvj.j(z7dVar2)) {
                        break;
                    } else {
                        i3++;
                    }
                } else if (z2) {
                    break;
                } else {
                    z3 = false;
                }
            }
            z3 = true;
        }
        f8d f8dVar = (f8d) this.G;
        f8d f8dVar2 = f8d.G;
        u7d u7dVar2 = u7d.G;
        if (f8dVar != f8dVar2) {
            if (u7dVar == u7d.E && z3) {
                this.H = t7dVar;
                l(t7dVar, !z || g8dVar.G);
            }
            if (u7dVar == u7d.F && z && t7dVar == ((t7d) this.H) && g8dVar.G) {
                int size4 = list2.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((z7d) list.get(i4)).a();
                }
            }
            if (u7dVar == u7dVar2 && !z3 && t7dVar != ((t7d) this.H)) {
                l(t7dVar, true);
            }
        }
        if (u7dVar == u7dVar2) {
            int size5 = list2.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    this.G = f8d.E;
                    g8dVar.G = false;
                    this.H = null;
                    break;
                } else if (!hvj.j((z7d) list.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (t7dVar == ((t7d) this.H) && z) {
                int size6 = list2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size6) {
                        break;
                    }
                    if (!((z7d) list.get(i6)).l()) {
                        i6++;
                    } else if (!g8dVar.G) {
                        J(t7dVar);
                        return;
                    }
                }
                int size7 = list2.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    ((z7d) list.get(i7)).a();
                }
            }
        }
    }

    public void F(b5c b5cVar) {
        x5c x5cVar = (x5c) ((w05) this.H).a.get(b5cVar.getClass());
        if (x5cVar != null) {
            x5cVar.b(b5cVar);
        }
    }

    public void G(cu9 cu9Var) {
        this.F = cu9Var;
    }

    @Override // defpackage.tr9
    public void H(Object obj) {
        ArrayList arrayList = (ArrayList) this.F;
        rl rlVar = (rl) this.G;
        sxb sxbVar = (sxb) this.H;
        Object objY0 = pyk.y0((uqb) rlVar.H, obj);
        if (objY0 == null) {
            objY0 = ajk.f("Unsupported annotation argument: " + sxbVar);
        }
        arrayList.add(objY0);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object I(defpackage.vp4 r18, java.lang.String r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c61.I(vp4, java.lang.String, boolean):java.lang.Object");
    }

    public void J(t7d t7dVar) {
        if (((f8d) this.G) == f8d.F) {
            cu9 cu9Var = (cu9) this.F;
            if (cu9Var == null) {
                sz6.j("layoutCoordinates not set");
                return;
            } else {
                pvj.j(t7dVar, cu9Var.K(0L), new h4(23, (g8d) this.I), true);
            }
        }
        this.G = f8d.G;
    }

    @Override // defpackage.tr9
    public void K(gh3 gh3Var, sxb sxbVar) {
        ((ArrayList) this.F).add(new mq6(gh3Var, sxbVar));
    }

    public c61 L() {
        return new c61(this, (mvd) this.G);
    }

    public lsj M(c61 c61Var, k0... k0VarArr) {
        lsj lsjVarK = lsj.v;
        for (k0 k0Var : k0VarArr) {
            lsjVarK = csk.k(k0Var);
            gqk.m((c61) this.H);
            if ((lsjVarK instanceof tsj) || (lsjVarK instanceof osj)) {
                lsjVarK = ((mvd) this.F).n(c61Var, lsjVarK);
            }
        }
        return lsjVarK;
    }

    public lsj N(String str) {
        do {
            HashMap map = (HashMap) this.H;
            if (map.containsKey(str)) {
                return (lsj) map.get(str);
            }
            this = (c61) this.F;
        } while (this != null);
        sz6.p(kgh.o(str, " is not defined"));
        return null;
    }

    public lsj O(jqj jqjVar) {
        lsj lsjVarN = lsj.v;
        Iterator itW = jqjVar.w();
        while (itW.hasNext()) {
            lsjVarN = ((mvd) this.G).n(this, jqjVar.p(((Integer) itW.next()).intValue()));
            if (lsjVarN instanceof drj) {
                break;
            }
        }
        return lsjVarN;
    }

    public lsj P(lsj lsjVar) {
        return ((mvd) this.G).n(this, lsjVar);
    }

    public void Q(String str, lsj lsjVar) {
        if (((HashMap) this.I).containsKey(str)) {
            return;
        }
        HashMap map = (HashMap) this.H;
        if (lsjVar == null) {
            map.remove(str);
        } else {
            map.put(str, lsjVar);
        }
    }

    public boolean R(String str) {
        while (!((HashMap) this.H).containsKey(str)) {
            this = (c61) this.F;
            if (this == null) {
                return false;
            }
        }
        return true;
    }

    public void S(String str, lsj lsjVar) {
        HashMap map;
        while (true) {
            map = (HashMap) this.H;
            c61 c61Var = (c61) this.F;
            if (map.containsKey(str) || c61Var == null || !c61Var.R(str)) {
                break;
            } else {
                this = c61Var;
            }
        }
        if (((HashMap) this.I).containsKey(str)) {
            return;
        }
        if (lsjVar == null) {
            map.remove(str);
        } else {
            map.put(str, lsjVar);
        }
    }

    @Override // defpackage.see
    public void accept(Object obj, Object obj2) {
        b99 b99Var = (b99) this.F;
        j5h j5hVar = (j5h) obj2;
        fvk fvkVar = (fvk) obj;
        String str = (String) this.G;
        String str2 = (String) this.H;
        byte[] bArr = (byte[]) this.I;
        try {
            p7k p7kVar = new p7k(b99Var, j5hVar);
            hik hikVar = (hik) fvkVar.t();
            duk dukVar = new duk();
            dukVar.j = p7kVar;
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(hikVar.k);
            int i = lyj.a;
            parcelObtain.writeStrongBinder(dukVar);
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeByteArray(bArr);
            hikVar.G(parcelObtain, 12);
        } catch (RemoteException e) {
            j5hVar.a(e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    @Override // defpackage.dxg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(byte[] r33, int r34, int r35, defpackage.cxg r36, defpackage.gm4 r37) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c61.b(byte[], int, int, cxg, gm4):void");
    }

    public void e(k7c k7cVar) {
        int i;
        if (k7cVar.b == null && (i = k7cVar.h) != 0) {
            k7cVar.b = IconCompat.c(null, "", i);
        }
        IconCompat iconCompat = k7cVar.b;
        int i2 = k7cVar.f;
        boolean z = k7cVar.d;
        Bundle bundle = k7cVar.a;
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompat != null ? iconCompat.f(null) : null, k7cVar.i, k7cVar.j);
        bfe[] bfeVarArr = k7cVar.c;
        if (bfeVarArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[bfeVarArr.length];
            for (int i3 = 0; i3 < bfeVarArr.length; i3++) {
                bfe bfeVar = bfeVarArr[i3];
                RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(bfeVar.a).setLabel(bfeVar.b).setChoices(bfeVar.c).setAllowFreeFormInput(bfeVar.d).addExtras(bfeVar.f);
                Set set = bfeVar.g;
                if (set != null) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        builderAddExtras.setAllowDataType((String) it.next(), true);
                    }
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    le0.r(builderAddExtras, bfeVar.e);
                }
                remoteInputArr[i3] = builderAddExtras.build();
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", z);
        builder.setAllowGeneratedReplies(z);
        bundle2.putInt("android.support.action.semanticAction", i2);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            ke0.o(builder, i2);
        }
        if (i4 >= 29) {
            le0.q(builder, k7cVar.g);
        }
        if (i4 >= 31) {
            oe0.k(builder, k7cVar.k);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", k7cVar.e);
        builder.addExtras(bundle2);
        ((Notification.Builder) this.G).addAction(builder.build());
    }

    @Override // defpackage.ns
    public void f(y7e y7eVar) {
        LocalDateTime localDateTimeR;
        LocalDateTime localDateTimeR2;
        Period period = (Period) this.G;
        y7eVar.getClass();
        cea ceaVar = (cea) this.F;
        if (vok.k(y7eVar, ceaVar)) {
            LocalDateTime localDateTimePlus = ceaVar.a;
            boolean z = y7eVar instanceof i69;
            if (z) {
                i69 i69Var = (i69) y7eVar;
                Instant instantA = i69Var.a();
                ZoneId zoneIdC = i69Var.c();
                instantA.getClass();
                if (zoneIdC == null) {
                    zoneIdC = ZoneId.systemDefault();
                }
                LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(instantA, zoneIdC);
                localDateTimeOfInstant.getClass();
                localDateTimeR = r(localDateTimeOfInstant);
            } else {
                if (!(y7eVar instanceof sa9)) {
                    xh6.d("Unsupported value for aggregation: ", y7eVar);
                    return;
                }
                sa9 sa9Var = (sa9) y7eVar;
                Instant instantB = sa9Var.b();
                ZoneId zoneIdG = sa9Var.g();
                instantB.getClass();
                if (zoneIdG == null) {
                    zoneIdG = ZoneId.systemDefault();
                }
                LocalDateTime localDateTimeOfInstant2 = LocalDateTime.ofInstant(instantB, zoneIdG);
                localDateTimeOfInstant2.getClass();
                localDateTimeR = r(localDateTimeOfInstant2);
            }
            localDateTimePlus.getClass();
            if (localDateTimePlus.compareTo((Object) localDateTimeR) < 0) {
                localDateTimePlus = localDateTimeR;
            }
            if (z) {
                localDateTimeR2 = localDateTimePlus;
            } else {
                if (!(y7eVar instanceof sa9)) {
                    xh6.d("Unsupported value for aggregation: ", y7eVar);
                    return;
                }
                sa9 sa9Var2 = (sa9) y7eVar;
                Instant instantE = sa9Var2.e();
                ZoneId zoneIdF = sa9Var2.f();
                instantE.getClass();
                if (zoneIdF == null) {
                    zoneIdF = ZoneId.systemDefault();
                }
                LocalDateTime localDateTimeOfInstant3 = LocalDateTime.ofInstant(instantE, zoneIdF);
                localDateTimeOfInstant3.getClass();
                localDateTimeR2 = r(localDateTimeOfInstant3);
            }
            while (localDateTimePlus.compareTo(localDateTimeR2) <= 0 && localDateTimePlus.compareTo((ChronoLocalDateTime<?>) ceaVar.b) < 0) {
                LocalDateTime localDateTimePlus2 = localDateTimePlus.plus((TemporalAmount) period);
                localDateTimePlus2.getClass();
                cea ceaVar2 = new cea(localDateTimePlus, (LocalDateTime) nai.V(localDateTimePlus2, ceaVar.b));
                if (vok.k(y7eVar, ceaVar2)) {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) this.I;
                    Object obj = linkedHashMap.get(localDateTimePlus);
                    if (obj == null) {
                        obj = (fs) ((bz7) this.H).invoke(ceaVar2);
                        linkedHashMap.put(localDateTimePlus, obj);
                    }
                    ((fs) obj).b(y7eVar);
                }
                localDateTimePlus = localDateTimePlus.plus((TemporalAmount) period);
                localDateTimePlus.getClass();
            }
        }
    }

    public void g(Object obj, Object obj2, cq9 cq9Var, boolean z) throws GeneralSecurityException {
        byte[] bArrArray;
        if (((ConcurrentHashMap) this.G) == null) {
            sz6.j("addPrimitive cannot be called after build");
            return;
        }
        if (obj == null && obj2 == null) {
            rl7.j("at least one of the `fullPrimitive` or `primitive` must be set");
            return;
        }
        if (cq9Var.D() != dp9.ENABLED) {
            rl7.j("only ENABLED key is allowed");
            return;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.G;
        Integer numValueOf = Integer.valueOf(cq9Var.B());
        if (cq9Var.C() == bmc.RAW) {
            numValueOf = null;
        }
        ybi ybiVarA = gwb.b.a(jud.e(cq9Var.A().B(), cq9Var.A().C(), cq9Var.A().A(), cq9Var.C(), numValueOf));
        int iOrdinal = cq9Var.C().ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(cq9Var.B()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(cq9Var.B()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                rl7.j("unknown output prefix type");
                return;
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(cq9Var.B()).array();
        } else {
            bArrArray = dwk.a;
        }
        sfd sfdVar = new sfd(obj, obj2, bArrArray, cq9Var.D(), cq9Var.C(), cq9Var.B(), cq9Var.A().B(), ybiVarA);
        ArrayList arrayList = new ArrayList();
        arrayList.add(sfdVar);
        byte[] bArr = sfdVar.c;
        tfd tfdVar = new tfd(bArr != null ? Arrays.copyOf(bArr, bArr.length) : null);
        List list = (List) concurrentHashMap.put(tfdVar, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(sfdVar);
            concurrentHashMap.put(tfdVar, Collections.unmodifiableList(arrayList2));
        }
        if (z) {
            if (((sfd) this.H) == null) {
                this.H = sfdVar;
            } else {
                sz6.j("you cannot set two primary primitives");
            }
        }
    }

    @Override // defpackage.ns
    public Object getResult() {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.I;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            LocalDateTime localDateTime = (LocalDateTime) entry.getKey();
            hs hsVarA = ((fs) entry.getValue()).a();
            LocalDateTime localDateTimePlus = localDateTime.plus((TemporalAmount) this.G);
            localDateTimePlus.getClass();
            arrayList.add(new ks(hsVarA, localDateTime, (LocalDateTime) nai.V(localDateTimePlus, ((cea) this.F).b), false));
        }
        return arrayList;
    }

    public void h(String str, boolean z) {
        Long l;
        long jB = ((mn5) this.H).b();
        bj0 bj0Var = (bj0) this.G;
        xi0 xi0VarA = bj0Var.a();
        this.I = new rx3(jB, xi0VarA.f + ((xi0VarA.a || (l = xi0VarA.e) == null) ? 0L : bj0Var.E.b() - l.longValue()), str, z);
    }

    public jn8 i() {
        Integer num = (Integer) this.F;
        if (num == null) {
            rl7.j("key size is not set");
            return null;
        }
        if (((Integer) this.G) == null) {
            rl7.j("tag size is not set");
            return null;
        }
        if (((zf) this.H) == null) {
            rl7.j("hash type is not set");
            return null;
        }
        if (((wg) this.I) == null) {
            rl7.j("variant is not set");
            return null;
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.F));
        }
        Integer num2 = (Integer) this.G;
        int iIntValue = num2.intValue();
        zf zfVar = (zf) this.H;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (zfVar == zf.R) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (zfVar == zf.S) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (zfVar == zf.T) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (zfVar == zf.U) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (zfVar != zf.V) {
                rl7.j("unknown hash type; must be SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new jn8(((Integer) this.F).intValue(), ((Integer) this.G).intValue(), (wg) this.I, (zf) this.H);
    }

    @Override // defpackage.sr9, defpackage.tr9
    public void j() {
        switch (this.E) {
            case 2:
                ((hi6) this.G).j();
                ((ArrayList) ((c61) this.H).F).add(new uc0((jc0) w44.e1((ArrayList) this.I)));
                break;
            default:
                hi6 hi6Var = (hi6) this.I;
                sxb sxbVar = (sxb) this.H;
                ArrayList arrayList = (ArrayList) this.F;
                arrayList.getClass();
                eri eriVarE = ac1.e(sxbVar, (qqb) hi6Var.H);
                if (eriVarE != null) {
                    HashMap map = (HashMap) hi6Var.F;
                    List listR = gb9.r(arrayList);
                    yr9 type = eriVarE.getType();
                    type.getClass();
                    map.put(sxbVar, new hbi(listR, type));
                    break;
                } else if (((rl) hi6Var.G).G((gh3) hi6Var.I) && x44.r(sxbVar.b(), ExperienceToggle.DEFAULT_PARAM_KEY)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (obj instanceof uc0) {
                            arrayList2.add(obj);
                        }
                    }
                    List list = (List) hi6Var.J;
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        list.add((jc0) ((uc0) it.next()).a);
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.tr9
    public void j0(jh3 jh3Var) {
        ((ArrayList) this.F).add(new bm9(new zl9(jh3Var)));
    }

    @Override // defpackage.sr9
    public void k(sxb sxbVar, Object obj) {
        ((hi6) this.F).k(sxbVar, obj);
    }

    public void l(t7d t7dVar, boolean z) {
        g8d g8dVar = (g8d) this.I;
        List list = t7dVar.a;
        List list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            if (((z7d) list.get(i)).l()) {
                J(t7dVar);
                return;
            }
        }
        cu9 cu9Var = (cu9) this.F;
        if (cu9Var == null) {
            sz6.j("layoutCoordinates not set");
            return;
        }
        pvj.j(t7dVar, cu9Var.K(0L), new g4(this, 10, g8dVar), false);
        if (((f8d) this.G) == f8d.F) {
            if (z) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((z7d) list.get(i2)).a();
                }
            }
            i99 i99Var = t7dVar.b;
            if (i99Var != null) {
                i99Var.E = !g8dVar.G;
            }
        }
    }

    @Override // defpackage.tr9
    public sr9 m(gh3 gh3Var) {
        ArrayList arrayList = new ArrayList();
        return new c61(((rl) this.G).H(gh3Var, neg.n, arrayList), this, arrayList);
    }

    public void n(String str, l34 l34Var, boolean z) {
        Long l;
        rx3 rx3Var = (rx3) this.I;
        if (rx3Var == null) {
            return;
        }
        Map map = rx3Var.g;
        if (!rx3Var.k || rx3Var.l) {
            return;
        }
        if (rx3Var.i || z || !(rx3Var.h == null || rx3Var.f == null)) {
            rx3Var.l = true;
            if (str != null) {
                qi3 qi3Var = (qi3) this.F;
                String str2 = l34Var != null ? l34Var.E : null;
                String str3 = rx3Var.j;
                boolean z2 = rx3Var.c;
                Long l2 = rx3Var.f;
                Long l3 = (Long) map.get(ar9.H);
                Long l4 = (Long) map.get(ar9.I);
                Long l5 = (Long) map.get(ar9.J);
                Long l6 = (Long) map.get(ar9.K);
                Long l7 = rx3Var.h;
                bj0 bj0Var = (bj0) this.G;
                xi0 xi0VarA = bj0Var.a();
                qi3Var.e(new CodeEvents$CodeSessionInitBreakdown(str, "android", str2, str3, z2, l2, l3, l4, l5, l6, l7, Long.valueOf((xi0VarA.f + ((xi0VarA.a || (l = xi0VarA.e) == null) ? 0L : bj0Var.E.b() - l.longValue())) - rx3Var.b)), CodeEvents$CodeSessionInitBreakdown.Companion.serializer());
            }
        }
    }

    public LinkedHashMap o(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Iterator it = ((ArrayList) this.G).iterator();
        if (!it.hasNext()) {
            return linkedHashMap;
        }
        it.next().getClass();
        mr9.o();
        return null;
    }

    public syg p(ob obVar) {
        ArrayList arrayList = (ArrayList) this.H;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            syg sygVar = (syg) arrayList.get(i);
            if (sygVar != null && sygVar.b == obVar) {
                return sygVar;
            }
        }
        syg sygVar2 = new syg((Context) this.G, obVar);
        arrayList.add(sygVar2);
        return sygVar2;
    }

    @Override // defpackage.sr9
    public void q(sxb sxbVar, jh3 jh3Var) {
        ((hi6) this.F).q(sxbVar, jh3Var);
    }

    public LocalDateTime r(LocalDateTime localDateTime) {
        LocalDateTime localDateTimePlus = ((cea) this.F).a;
        while (true) {
            int iCompareTo = localDateTime.compareTo((ChronoLocalDateTime<?>) localDateTimePlus);
            Period period = (Period) this.G;
            if (iCompareTo < 0) {
                LocalDateTime localDateTimeMinus = localDateTimePlus.minus((TemporalAmount) period);
                localDateTimeMinus.getClass();
                return localDateTimeMinus;
            }
            localDateTimePlus = localDateTimePlus.plus((TemporalAmount) period);
            localDateTimePlus.getClass();
        }
    }

    public int s() {
        ojb ojbVar = (ojb) this.F;
        int iA = ojbVar.a(4);
        if (iA != 0) {
            return ((ByteBuffer) ojbVar.d).getInt(iA + ojbVar.a);
        }
        return 0;
    }

    @Override // defpackage.sr9
    public tr9 t(sxb sxbVar) {
        return ((hi6) this.F).t(sxbVar);
    }

    @Override // defpackage.sr9
    public void u(sxb sxbVar, gh3 gh3Var, sxb sxbVar2) {
        ((hi6) this.F).u(sxbVar, gh3Var, sxbVar2);
    }

    public kjb v(String str) {
        if (!((ConcurrentHashMap) this.I).containsKey(str)) {
            synchronized (this) {
                try {
                    if (!((ConcurrentHashMap) this.I).containsKey(str)) {
                        try {
                            InputStream inputStreamA = ((pjb) this.F).a(str);
                            ((qjb) this.G).getClass();
                            for (n2d n2dVar : qjb.a(inputStreamA)) {
                                qb5 qb5Var = (qb5) this.H;
                                epk epkVar = (epk) qb5Var.F;
                                if (((String) ((iqa) epkVar.F).i(n2dVar)).equals("001")) {
                                    ((epk) qb5Var.E).d(n2dVar);
                                } else {
                                    epkVar.d(n2dVar);
                                }
                            }
                            ((ConcurrentHashMap) this.I).put(str, str);
                        } catch (IllegalArgumentException | IllegalStateException e) {
                            throw new IllegalStateException("Failed to read file ".concat(str), e);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (qb5) this.H;
    }

    public Object w(String str, byte[] bArr, boolean z, t74 t74Var) throws Throwable {
        Object objC0 = gb9.c0(((h86) this.I).b(), new x(this, bArr, z, str, null), t74Var);
        return objC0 == m45.E ? objC0 : iei.a;
    }

    public boolean x(q16 q16Var) {
        if (((q16) this.G).equals(q16Var)) {
            return true;
        }
        c61 c61Var = (c61) this.F;
        return c61Var != null ? c61Var.x(q16Var) : false;
    }

    public void y(String str, l34 l34Var) {
        Long l;
        String str2 = str;
        rx3 rx3Var = (rx3) this.I;
        if (rx3Var != null && rx3Var.f == null) {
            if (rx3Var.c || rx3Var.e) {
                long jB = ((mn5) this.H).b() - rx3Var.a;
                if (jB > 300000) {
                    n(str2, l34Var, true);
                    this.I = null;
                    return;
                }
                rx3Var.f = Long.valueOf(jB);
                if (str2 != null) {
                    qi3 qi3Var = (qi3) this.F;
                    boolean z = rx3Var.c;
                    String str3 = l34Var != null ? l34Var.E : null;
                    bj0 bj0Var = (bj0) this.G;
                    xi0 xi0VarA = bj0Var.a();
                    str2 = str;
                    qi3Var.e(new CodeEvents$CodeMessagePerceivedTTFT(str2, jB, z, (Long) null, "android", str3, Long.valueOf((xi0VarA.f + ((xi0VarA.a || (l = xi0VarA.e) == null) ? 0L : bj0Var.E.b() - l.longValue())) - rx3Var.b), rx3Var.d, 8, (mq5) null), CodeEvents$CodeMessagePerceivedTTFT.Companion.serializer());
                }
                n(str2, l34Var, false);
            }
        }
    }

    @Override // defpackage.sr9
    public sr9 z(gh3 gh3Var, sxb sxbVar) {
        return ((hi6) this.F).z(gh3Var, sxbVar);
    }

    public /* synthetic */ c61(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
    }

    public c61(c61 c61Var, mvd mvdVar) {
        this.E = 28;
        this.H = new HashMap();
        this.I = new HashMap();
        this.F = c61Var;
        this.G = mvdVar;
    }

    public c61(cea ceaVar, Period period, bz7 bz7Var) {
        this.E = 22;
        period.getClass();
        this.F = ceaVar;
        this.G = period;
        this.H = bz7Var;
        this.I = new LinkedHashMap();
    }

    public c61(g8d g8dVar) {
        this.E = 19;
        this.I = g8dVar;
        this.G = f8d.E;
    }

    public c61(pjb pjbVar, qjb qjbVar, qb5 qb5Var) {
        this.E = 5;
        this.F = pjbVar;
        this.G = qjbVar;
        this.H = qb5Var;
        this.I = new ConcurrentHashMap();
    }

    public c61(qi3 qi3Var, bj0 bj0Var, mn5 mn5Var) {
        this.E = 8;
        this.F = qi3Var;
        this.G = bj0Var;
        this.H = mn5Var;
    }

    public c61(ynf ynfVar) {
        this.E = 24;
        this.F = new HashMap(ynfVar.a);
        this.G = new HashMap(ynfVar.b);
        this.H = new HashMap(ynfVar.c);
        this.I = new HashMap(ynfVar.d);
    }

    public c61(int i) {
        this.E = i;
        switch (i) {
            case 24:
                this.F = new HashMap();
                this.G = new HashMap();
                this.H = new HashMap();
                this.I = new HashMap();
                break;
            case 27:
                mvd mvdVar = new mvd(11);
                mvdVar.F = new HashMap();
                mvdVar.G = new gtj(6);
                gtj gtjVar = new gtj(0);
                lxj lxjVar = lxj.BITWISE_AND;
                ArrayList arrayList = gtjVar.a;
                arrayList.add(lxjVar);
                arrayList.add(lxj.BITWISE_LEFT_SHIFT);
                arrayList.add(lxj.BITWISE_NOT);
                arrayList.add(lxj.BITWISE_OR);
                arrayList.add(lxj.BITWISE_RIGHT_SHIFT);
                arrayList.add(lxj.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(lxj.BITWISE_XOR);
                mvdVar.o(gtjVar);
                gtj gtjVar2 = new gtj(1);
                lxj lxjVar2 = lxj.EQUALS;
                ArrayList arrayList2 = gtjVar2.a;
                arrayList2.add(lxjVar2);
                arrayList2.add(lxj.GREATER_THAN);
                arrayList2.add(lxj.GREATER_THAN_EQUALS);
                arrayList2.add(lxj.IDENTITY_EQUALS);
                arrayList2.add(lxj.IDENTITY_NOT_EQUALS);
                arrayList2.add(lxj.LESS_THAN);
                arrayList2.add(lxj.LESS_THAN_EQUALS);
                arrayList2.add(lxj.NOT_EQUALS);
                mvdVar.o(gtjVar2);
                gtj gtjVar3 = new gtj(2);
                lxj lxjVar3 = lxj.APPLY;
                ArrayList arrayList3 = gtjVar3.a;
                arrayList3.add(lxjVar3);
                arrayList3.add(lxj.BLOCK);
                arrayList3.add(lxj.BREAK);
                arrayList3.add(lxj.CASE);
                arrayList3.add(lxj.DEFAULT);
                arrayList3.add(lxj.CONTINUE);
                arrayList3.add(lxj.DEFINE_FUNCTION);
                arrayList3.add(lxj.FN);
                arrayList3.add(lxj.IF);
                arrayList3.add(lxj.QUOTE);
                arrayList3.add(lxj.RETURN);
                arrayList3.add(lxj.SWITCH);
                arrayList3.add(lxj.TERNARY);
                mvdVar.o(gtjVar3);
                gtj gtjVar4 = new gtj(3);
                lxj lxjVar4 = lxj.AND;
                ArrayList arrayList4 = gtjVar4.a;
                arrayList4.add(lxjVar4);
                arrayList4.add(lxj.NOT);
                arrayList4.add(lxj.OR);
                mvdVar.o(gtjVar4);
                gtj gtjVar5 = new gtj(4);
                lxj lxjVar5 = lxj.FOR_IN;
                ArrayList arrayList5 = gtjVar5.a;
                arrayList5.add(lxjVar5);
                arrayList5.add(lxj.FOR_IN_CONST);
                arrayList5.add(lxj.FOR_IN_LET);
                arrayList5.add(lxj.FOR_LET);
                arrayList5.add(lxj.FOR_OF);
                arrayList5.add(lxj.FOR_OF_CONST);
                arrayList5.add(lxj.FOR_OF_LET);
                arrayList5.add(lxj.WHILE);
                mvdVar.o(gtjVar5);
                gtj gtjVar6 = new gtj(5);
                lxj lxjVar6 = lxj.ADD;
                ArrayList arrayList6 = gtjVar6.a;
                arrayList6.add(lxjVar6);
                arrayList6.add(lxj.DIVIDE);
                arrayList6.add(lxj.MODULUS);
                arrayList6.add(lxj.MULTIPLY);
                arrayList6.add(lxj.NEGATE);
                arrayList6.add(lxj.POST_DECREMENT);
                arrayList6.add(lxj.POST_INCREMENT);
                arrayList6.add(lxj.PRE_DECREMENT);
                arrayList6.add(lxj.PRE_INCREMENT);
                arrayList6.add(lxj.SUBTRACT);
                mvdVar.o(gtjVar6);
                gtj gtjVar7 = new gtj(7);
                lxj lxjVar7 = lxj.ASSIGN;
                ArrayList arrayList7 = gtjVar7.a;
                arrayList7.add(lxjVar7);
                arrayList7.add(lxj.CONST);
                arrayList7.add(lxj.CREATE_ARRAY);
                arrayList7.add(lxj.CREATE_OBJECT);
                arrayList7.add(lxj.EXPRESSION_LIST);
                arrayList7.add(lxj.GET);
                arrayList7.add(lxj.GET_INDEX);
                arrayList7.add(lxj.GET_PROPERTY);
                arrayList7.add(lxj.NULL);
                arrayList7.add(lxj.SET_PROPERTY);
                arrayList7.add(lxj.TYPEOF);
                arrayList7.add(lxj.UNDEFINED);
                arrayList7.add(lxj.VAR);
                mvdVar.o(gtjVar7);
                this.F = mvdVar;
                c61 c61Var = new c61((c61) null, mvdVar);
                this.H = c61Var;
                this.G = c61Var.L();
                w05 w05Var = new w05();
                HashMap map = new HashMap();
                w05Var.a = map;
                this.I = w05Var;
                c61Var.S("require", new f6l(w05Var));
                map.put("internal.platform", new k7k());
                c61Var.S("runtime.counter", new yqj(Double.valueOf(0.0d)));
                break;
            default:
                this.F = new ssc();
                this.G = new ssc();
                this.H = new c0d();
                break;
        }
    }

    public /* synthetic */ c61(int i, boolean z) {
        this.E = i;
    }

    public c61(Typeface typeface, ojb ojbVar) {
        int i;
        int i2;
        int i3;
        int i4;
        this.E = 15;
        this.I = typeface;
        this.F = ojbVar;
        this.H = new sjb(FreeTypeConstants.FT_LOAD_NO_RECURSE);
        int iA = ojbVar.a(6);
        if (iA != 0) {
            int i5 = iA + ojbVar.a;
            i = ((ByteBuffer) ojbVar.d).getInt(((ByteBuffer) ojbVar.d).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.G = new char[i * 2];
        int iA2 = ojbVar.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + ojbVar.a;
            i2 = ((ByteBuffer) ojbVar.d).getInt(((ByteBuffer) ojbVar.d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            pbi pbiVar = new pbi(this, i7);
            njb njbVarB = pbiVar.b();
            int iA3 = njbVarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) njbVarB.d).getInt(iA3 + njbVarB.a) : 0, (char[]) this.G, i7 * 2);
            njb njbVarB2 = pbiVar.b();
            int iA4 = njbVarB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + njbVarB2.a;
                i3 = ((ByteBuffer) njbVarB2.d).getInt(((ByteBuffer) njbVarB2.d).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (i3 > 0) {
                sjb sjbVar = (sjb) this.H;
                njb njbVarB3 = pbiVar.b();
                int iA5 = njbVarB3.a(16);
                if (iA5 != 0) {
                    int i9 = iA5 + njbVarB3.a;
                    i4 = ((ByteBuffer) njbVarB3.d).getInt(((ByteBuffer) njbVarB3.d).getInt(i9) + i9);
                } else {
                    i4 = 0;
                }
                sjbVar.a(pbiVar, 0, i4 - 1);
            } else {
                sz6.p("invalid metadata codepoint length");
                throw null;
            }
        }
    }

    public c61(dl2 dl2Var, h86 h86Var, oda odaVar, koi koiVar) {
        this.E = 6;
        dl2Var.getClass();
        odaVar.getClass();
        koiVar.getClass();
        h86Var.getClass();
        this.F = dl2Var;
        this.G = odaVar;
        this.H = koiVar;
        this.I = h86Var;
    }

    public c61(f fVar, l45 l45Var, Context context) {
        this.E = 10;
        this.F = fVar;
        this.G = l45Var;
        this.H = context;
        this.I = new AtomicReference(null);
    }

    public c61(String str, Map map, hdc hdcVar, h86 h86Var) {
        this.E = 9;
        str.getClass();
        map.getClass();
        this.F = str;
        this.G = map;
        this.H = hdcVar;
        this.I = h86Var;
    }

    public c61(Context context, ActionMode.Callback callback) {
        this.E = 25;
        this.G = context;
        this.F = callback;
        this.H = new ArrayList();
        this.I = new w6g(0);
    }

    public c61(rl rlVar, sxb sxbVar, hi6 hi6Var) {
        this.E = 3;
        this.G = rlVar;
        this.H = sxbVar;
        this.I = hi6Var;
        this.F = new ArrayList();
    }

    public c61(hi6 hi6Var, c61 c61Var, ArrayList arrayList) {
        this.E = 2;
        this.G = hi6Var;
        this.H = c61Var;
        this.I = arrayList;
        this.F = hi6Var;
    }

    public c61(Signature signature) {
        this.E = 4;
        this.F = signature;
        this.G = null;
        this.H = null;
        this.I = null;
    }

    public c61(gq8 gq8Var, ir8 ir8Var) {
        x5c q25Var;
        this.E = 13;
        this.I = gq8Var;
        this.H = new w05(1);
        this.F = ir8Var;
        ArrayList arrayList = gq8Var.c;
        ArrayList arrayList2 = gq8Var.d;
        this.G = new ArrayList(arrayList.size());
        Iterator it = gq8Var.c.iterator();
        if (!it.hasNext()) {
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                switch (((fq8) arrayList2.get(size)).a) {
                    case 0:
                        q25Var = new q25(this);
                        break;
                    case 1:
                        q25Var = new zqg(this, 0);
                        break;
                    default:
                        q25Var = new zqg(this, 1);
                        break;
                }
                w05 w05Var = (w05) this.H;
                w05Var.getClass();
                Iterator it2 = q25Var.a().iterator();
                while (it2.hasNext()) {
                    w05Var.a.put((Class) it2.next(), q25Var);
                }
            }
            return;
        }
        it.next().getClass();
        mr9.o();
        throw null;
    }

    public c61(Cipher cipher) {
        this.E = 4;
        this.F = null;
        this.G = cipher;
        this.H = null;
        this.I = null;
    }

    public c61(Mac mac) {
        this.E = 4;
        this.F = null;
        this.G = null;
        this.H = mac;
        this.I = null;
    }

    public c61(IdentityCredential identityCredential) {
        this.E = 4;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = identityCredential;
    }

    public c61(vde vdeVar, i49 i49Var, epk epkVar, qb5 qb5Var) {
        Object objQ;
        this.E = 16;
        if (vdeVar != null) {
            objQ = nz8.q(vdeVar);
        } else {
            iz8 iz8Var = nz8.F;
            objQ = vde.I;
        }
        this.F = objQ;
        this.G = i49Var;
        this.H = epkVar;
        this.I = qb5Var;
    }

    public c61(Class cls) {
        this.E = 20;
        this.G = new ConcurrentHashMap();
        this.F = cls;
        this.I = yqb.b;
    }

    public c61(AudioTrack audioTrack, poj pojVar) {
        this.E = 0;
        this.F = audioTrack;
        this.G = pojVar;
        Handler handlerK = tpi.k(null);
        this.H = handlerK;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: b61
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                c61 c61Var = this.a;
                if (((b61) c61Var.I) == null) {
                    return;
                }
                ac1.d().execute(new fd(c61Var, 6, audioRouting));
            }
        };
        this.I = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handlerK);
    }

    public c61(w3i w3iVar, boolean[] zArr) {
        this.E = 21;
        this.F = w3iVar;
        this.G = zArr;
        int i = w3iVar.a;
        this.H = new boolean[i];
        this.I = new boolean[i];
    }
}
