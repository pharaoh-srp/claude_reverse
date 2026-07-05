package com.anthropic.claude.wear;

import android.content.Context;
import android.content.SharedPreferences;
import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.types.strings.OrganizationId;
import defpackage.bsg;
import defpackage.bw;
import defpackage.er9;
import defpackage.fd9;
import defpackage.fk0;
import defpackage.gb9;
import defpackage.grc;
import defpackage.gsk;
import defpackage.gvj;
import defpackage.hr9;
import defpackage.ih9;
import defpackage.ij0;
import defpackage.isg;
import defpackage.iuj;
import defpackage.kac;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.l45;
import defpackage.lsc;
import defpackage.mdg;
import defpackage.mdj;
import defpackage.mpk;
import defpackage.mq5;
import defpackage.n30;
import defpackage.onf;
import defpackage.oqb;
import defpackage.pza;
import defpackage.r6j;
import defpackage.sfa;
import defpackage.srg;
import defpackage.u00;
import defpackage.u0h;
import defpackage.um1;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.x44;
import defpackage.xe0;
import defpackage.yb5;
import defpackage.yfa;
import defpackage.ze0;
import defpackage.zfa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class PhoneWearableListenerService extends r6j implements hr9 {
    public static final /* synthetic */ int R = 0;
    public final kw9 M;
    public final kw9 N;
    public final kw9 O;
    public final u0h P;
    public final ih9 Q;

    public PhoneWearableListenerService() {
        int i = 10;
        bw bwVar = new bw(this, i);
        w1a w1aVar = w1a.E;
        this.M = yb5.w(w1aVar, bwVar);
        this.N = yb5.w(w1aVar, new bw(this, 11));
        this.O = yb5.w(w1aVar, new bw(this, 12));
        this.P = new u0h(new pza(i, this));
        this.Q = u00.c(new kac(28));
    }

    public static final AuthSyncCredentials f(PhoneWearableListenerService phoneWearableListenerService) {
        String value;
        kw9 kw9Var = phoneWearableListenerService.N;
        kw9 kw9Var2 = phoneWearableListenerService.O;
        Context applicationContext = phoneWearableListenerService.getApplicationContext();
        oqb oqbVar = fk0.K;
        applicationContext.getClass();
        String strE = wd6.p0(applicationContext).e();
        String lowerCase = null;
        if (strE != null) {
            SharedPreferences sharedPreferences = applicationContext.getApplicationContext().getSharedPreferences("account_prefs".concat(strE), 0);
            sharedPreferences.getClass();
            String string = sharedPreferences.getString("selected_org_id", null);
            String strM1066constructorimpl = string != null ? OrganizationId.m1066constructorimpl(string) : null;
            lsc lscVarP = mpk.P(strM1066constructorimpl != null ? OrganizationId.m1065boximpl(strM1066constructorimpl) : null);
            mpk.P(sharedPreferences.getString("display_email", null));
            mpk.P(sharedPreferences.getString("conway_saved_client_id", null));
            new mdg();
            new mdg();
            OrganizationId organizationId = (OrganizationId) lscVarP.getValue();
            String strM1071unboximpl = organizationId != null ? organizationId.m1071unboximpl() : null;
            if (strM1071unboximpl != null) {
                ze0 ze0Var = (ze0) kw9Var2.getValue();
                SharedPreferences sharedPreferences2 = applicationContext.getSharedPreferences(x44.r(ze0Var, xe0.g) ? "user_cookies_".concat(strE) : ij0.k("user_cookies___", isg.n0(ze0Var.a(), "/", "-", false), "__", strE), 0);
                sharedPreferences2.getClass();
                Map<String, ?> all = sharedPreferences2.getAll();
                all.getClass();
                Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        value = null;
                        break;
                    }
                    Map.Entry<String, ?> next = it.next();
                    String key = next.getKey();
                    Object value2 = next.getValue();
                    key.getClass();
                    if (isg.h0(key, "|sessionKey", false) && (value2 instanceof String)) {
                        try {
                            ih9 ih9Var = phoneWearableListenerService.Q;
                            ih9Var.getClass();
                            SerializableCookieSlim serializableCookieSlim = (SerializableCookieSlim) ih9Var.b((String) value2, SerializableCookieSlim.Companion.serializer());
                            if (x44.r(serializableCookieSlim.getName(), "sessionKey") && serializableCookieSlim.getValue().length() > 0) {
                                value = serializableCookieSlim.getValue();
                                break;
                            }
                        } catch (Exception e) {
                            zfa.a.getClass();
                            if (yfa.b()) {
                                String strE2 = iuj.E(phoneWearableListenerService);
                                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                                ArrayList arrayList = new ArrayList();
                                for (Object obj : copyOnWriteArrayList) {
                                    ((n30) ((zfa) obj)).getClass();
                                    arrayList.add(obj);
                                }
                                if (!arrayList.isEmpty()) {
                                    zfa.a.getClass();
                                    String strK = ij0.k("Failed to deserialize cookie for key=", key, ": ", gsk.c(e));
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        ((n30) ((zfa) it2.next())).b(sfa.WARN, strE2, strK);
                                    }
                                }
                            }
                        }
                    }
                }
                if (value == null) {
                    return null;
                }
                String strA = ((ze0) kw9Var2.getValue()).a();
                if (bsg.u0(strA, "localhost", false) || bsg.u0(strA, "10.0.2.2", false) || bsg.u0(strA, "127.0.0.1", false)) {
                    strA = "https://claude.ai";
                }
                String str = strA;
                String strB = ((um1) kw9Var.getValue()).b();
                if (strB != null) {
                    lowerCase = strB.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                }
                String str2 = lowerCase;
                String strA2 = ((um1) kw9Var.getValue()).a();
                return new AuthSyncCredentials(value, strM1071unboximpl, str, str2, x44.r(strA2, "SLOW") ? 0.8f : x44.r(strA2, "FAST") ? 1.2f : 1.0f);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(com.anthropic.claude.wear.PhoneWearableListenerService r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, defpackage.vp4 r13) throws java.lang.Exception {
        /*
            boolean r0 = r13 instanceof defpackage.k2d
            if (r0 == 0) goto L13
            r0 = r13
            k2d r0 = (defpackage.k2d) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            k2d r0 = new k2d
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.sf5.h0(r13)
            goto L75
        L25:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            r9 = 0
            return r9
        L2c:
            defpackage.sf5.h0(r13)
            b99 r4 = new b99
            d88 r13 = defpackage.d88.c
            nyj r1 = defpackage.yhk.d
            q6j r3 = defpackage.q6j.E
            r4.<init>(r9, r1, r3, r13)
            java.nio.charset.Charset r9 = defpackage.dj2.a
            byte[] r7 = r12.getBytes(r9)
            r7.getClass()
            w19 r9 = defpackage.w19.b()
            c61 r3 = new c61
            r8 = 29
            r5 = r10
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r9.c = r3
            r10 = 24020(0x5dd4, float:3.3659E-41)
            r9.b = r10
            jf7 r10 = defpackage.uik.b
            jf7[] r10 = new defpackage.jf7[]{r10}
            r9.d = r10
            w19 r9 = r9.a()
            r10 = 0
            r5l r9 = r4.c(r10, r9)
            r9.getClass()
            r0.G = r2
            java.lang.Object r9 = defpackage.zh4.k(r9, r0)
            m45 r10 = defpackage.m45.E
            if (r9 != r10) goto L75
            return r10
        L75:
            iei r9 = defpackage.iei.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.wear.PhoneWearableListenerService.g(com.anthropic.claude.wear.PhoneWearableListenerService, java.lang.String, java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    @Override // defpackage.hr9
    public final /* bridge */ er9 e() {
        return gb9.y();
    }

    @Override // defpackage.r6j, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        fd9.z((l45) this.P.getValue(), null);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0083\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lcom/anthropic/claude/wear/PhoneWearableListenerService$AuthSyncError;", "", "", "error", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/wear/PhoneWearableListenerService$AuthSyncError;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/wear/PhoneWearableListenerService$AuthSyncError;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getError", "getMessage", "Companion", "com/anthropic/claude/wear/c", "com/anthropic/claude/wear/d", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class AuthSyncError {
        public static final d Companion = new d();
        private final String error;
        private final String message;

        public /* synthetic */ AuthSyncError(int i, String str, String str2, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, c.a.getDescriptor());
                throw null;
            }
            this.error = str;
            this.message = str2;
        }

        public static /* synthetic */ AuthSyncError copy$default(AuthSyncError authSyncError, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = authSyncError.error;
            }
            if ((i & 2) != 0) {
                str2 = authSyncError.message;
            }
            return authSyncError.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$app(AuthSyncError self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.error);
            output.q(serialDesc, 1, self.message);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final AuthSyncError copy(String error, String message) {
            error.getClass();
            message.getClass();
            return new AuthSyncError(error, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthSyncError)) {
                return false;
            }
            AuthSyncError authSyncError = (AuthSyncError) other;
            return x44.r(this.error, authSyncError.error) && x44.r(this.message, authSyncError.message);
        }

        public final String getError() {
            return this.error;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode() + (this.error.hashCode() * 31);
        }

        public String toString() {
            return ij0.l("AuthSyncError(error=", this.error, ", message=", this.message, ")");
        }

        public AuthSyncError(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.error = str;
            this.message = str2;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0083\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lcom/anthropic/claude/wear/PhoneWearableListenerService$SerializableCookieSlim;", "", "", "name", ExperienceToggle.DEFAULT_PARAM_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/wear/PhoneWearableListenerService$SerializableCookieSlim;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/wear/PhoneWearableListenerService$SerializableCookieSlim;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getValue", "Companion", "com/anthropic/claude/wear/e", "com/anthropic/claude/wear/f", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class SerializableCookieSlim {
        public static final f Companion = new f();
        private final String name;
        private final String value;

        public /* synthetic */ SerializableCookieSlim(int i, String str, String str2, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, e.a.getDescriptor());
                throw null;
            }
            this.name = str;
            this.value = str2;
        }

        public static /* synthetic */ SerializableCookieSlim copy$default(SerializableCookieSlim serializableCookieSlim, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = serializableCookieSlim.name;
            }
            if ((i & 2) != 0) {
                str2 = serializableCookieSlim.value;
            }
            return serializableCookieSlim.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$app(SerializableCookieSlim self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.name);
            output.q(serialDesc, 1, self.value);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final SerializableCookieSlim copy(String name, String value) {
            name.getClass();
            value.getClass();
            return new SerializableCookieSlim(name, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SerializableCookieSlim)) {
                return false;
            }
            SerializableCookieSlim serializableCookieSlim = (SerializableCookieSlim) other;
            return x44.r(this.name, serializableCookieSlim.name) && x44.r(this.value, serializableCookieSlim.value);
        }

        public final String getName() {
            return this.name;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.name.hashCode() * 31);
        }

        public String toString() {
            return ij0.l("SerializableCookieSlim(name=", this.name, ", value=", this.value, ")");
        }

        public SerializableCookieSlim(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.name = str;
            this.value = str2;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u0000 02\u00020\u0001:\u000212B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJD\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001f¨\u00063"}, d2 = {"Lcom/anthropic/claude/wear/PhoneWearableListenerService$AuthSyncCredentials;", "", "", "sessionKey", "orgId", "baseUrl", "voiceSelection", "", "playbackSpeed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;F)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$app", "(Lcom/anthropic/claude/wear/PhoneWearableListenerService$AuthSyncCredentials;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()F", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;F)Lcom/anthropic/claude/wear/PhoneWearableListenerService$AuthSyncCredentials;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSessionKey", "getOrgId", "getBaseUrl", "getVoiceSelection", "F", "getPlaybackSpeed", "Companion", "com/anthropic/claude/wear/a", "com/anthropic/claude/wear/b", "app"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class AuthSyncCredentials {
        public static final b Companion = new b();
        private final String baseUrl;
        private final String orgId;
        private final float playbackSpeed;
        private final String sessionKey;
        private final String voiceSelection;

        public /* synthetic */ AuthSyncCredentials(int i, String str, String str2, String str3, String str4, float f, vnf vnfVar) {
            if (7 != (i & 7)) {
                gvj.f(i, 7, a.a.getDescriptor());
                throw null;
            }
            this.sessionKey = str;
            this.orgId = str2;
            this.baseUrl = str3;
            if ((i & 8) == 0) {
                this.voiceSelection = null;
            } else {
                this.voiceSelection = str4;
            }
            if ((i & 16) == 0) {
                this.playbackSpeed = 1.0f;
            } else {
                this.playbackSpeed = f;
            }
        }

        public static /* synthetic */ AuthSyncCredentials copy$default(AuthSyncCredentials authSyncCredentials, String str, String str2, String str3, String str4, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                str = authSyncCredentials.sessionKey;
            }
            if ((i & 2) != 0) {
                str2 = authSyncCredentials.orgId;
            }
            if ((i & 4) != 0) {
                str3 = authSyncCredentials.baseUrl;
            }
            if ((i & 8) != 0) {
                str4 = authSyncCredentials.voiceSelection;
            }
            if ((i & 16) != 0) {
                f = authSyncCredentials.playbackSpeed;
            }
            float f2 = f;
            String str5 = str3;
            return authSyncCredentials.copy(str, str2, str5, str4, f2);
        }

        public static final /* synthetic */ void write$Self$app(AuthSyncCredentials self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.sessionKey);
            output.q(serialDesc, 1, self.orgId);
            output.q(serialDesc, 2, self.baseUrl);
            if (output.E(serialDesc) || self.voiceSelection != null) {
                output.B(serialDesc, 3, srg.a, self.voiceSelection);
            }
            if (!output.E(serialDesc) && Float.compare(self.playbackSpeed, 1.0f) == 0) {
                return;
            }
            output.k(serialDesc, 4, self.playbackSpeed);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSessionKey() {
            return this.sessionKey;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getOrgId() {
            return this.orgId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getBaseUrl() {
            return this.baseUrl;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getVoiceSelection() {
            return this.voiceSelection;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final float getPlaybackSpeed() {
            return this.playbackSpeed;
        }

        public final AuthSyncCredentials copy(String sessionKey, String orgId, String baseUrl, String voiceSelection, float playbackSpeed) {
            sessionKey.getClass();
            orgId.getClass();
            baseUrl.getClass();
            return new AuthSyncCredentials(sessionKey, orgId, baseUrl, voiceSelection, playbackSpeed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthSyncCredentials)) {
                return false;
            }
            AuthSyncCredentials authSyncCredentials = (AuthSyncCredentials) other;
            return x44.r(this.sessionKey, authSyncCredentials.sessionKey) && x44.r(this.orgId, authSyncCredentials.orgId) && x44.r(this.baseUrl, authSyncCredentials.baseUrl) && x44.r(this.voiceSelection, authSyncCredentials.voiceSelection) && Float.compare(this.playbackSpeed, authSyncCredentials.playbackSpeed) == 0;
        }

        public final String getBaseUrl() {
            return this.baseUrl;
        }

        public final String getOrgId() {
            return this.orgId;
        }

        public final float getPlaybackSpeed() {
            return this.playbackSpeed;
        }

        public final String getSessionKey() {
            return this.sessionKey;
        }

        public final String getVoiceSelection() {
            return this.voiceSelection;
        }

        public int hashCode() {
            int iL = kgh.l(kgh.l(this.sessionKey.hashCode() * 31, 31, this.orgId), 31, this.baseUrl);
            String str = this.voiceSelection;
            return Float.hashCode(this.playbackSpeed) + ((iL + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            String str = this.sessionKey;
            String str2 = this.orgId;
            String str3 = this.baseUrl;
            String str4 = this.voiceSelection;
            float f = this.playbackSpeed;
            StringBuilder sbR = kgh.r("AuthSyncCredentials(sessionKey=", str, ", orgId=", str2, ", baseUrl=");
            kgh.u(sbR, str3, ", voiceSelection=", str4, ", playbackSpeed=");
            sbR.append(f);
            sbR.append(")");
            return sbR.toString();
        }

        public AuthSyncCredentials(String str, String str2, String str3, String str4, float f) {
            grc.B(str, str2, str3);
            this.sessionKey = str;
            this.orgId = str2;
            this.baseUrl = str3;
            this.voiceSelection = str4;
            this.playbackSpeed = f;
        }

        public /* synthetic */ AuthSyncCredentials(String str, String str2, String str3, String str4, float f, int i, mq5 mq5Var) {
            this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? 1.0f : f);
        }
    }
}
