package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import androidx.health.platform.client.proto.g;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.anthropic.claude.api.chat.MessageFile;
import com.anthropic.claude.api.chat.messages.ContentBlock;
import com.anthropic.claude.api.chat.messages.ContentBlockDelta;
import com.anthropic.claude.api.chat.messages.StreamEvent;
import com.anthropic.claude.api.chat.tool.SourceMetadata;
import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import com.anthropic.claude.api.chat.tool.ToolResultContent;
import com.anthropic.claude.api.experience.ExperienceClientAction;
import com.anthropic.claude.api.experience.ExperienceContent;
import com.anthropic.claude.api.experience.ExperienceTrackActionData;
import com.anthropic.claude.api.model.DisabledReason;
import com.anthropic.claude.api.model.ThinkingState;
import com.anthropic.claude.api.tasks.TaskSessionEvent;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.stt.repo.api.STTApiMessage;
import com.anthropic.claude.types.environment.AppEnvironment;
import com.anthropic.claude.types.strings.AppSessionId;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.modules.a;
import org.koin.android.error.MissingAndroidContextException;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gg7 implements pz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ gg7(int i) {
        this.E = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws MissingAndroidContextException {
        jm7 jm7Var;
        String str;
        int i = this.E;
        w1a w1aVar = w1a.E;
        iei ieiVar = iei.a;
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                m7f m7fVar = (m7f) obj;
                m7fVar.getClass();
                ((bsc) obj2).getClass();
                return ((v4d) m7fVar.a(jce.a.b(v4d.class), null, null)).a("growthbook_overrides");
            case 1:
                m7f m7fVar2 = (m7f) obj;
                m7fVar2.getClass();
                ((bsc) obj2).getClass();
                kce kceVar = jce.a;
                fn0 fn0Var = (fn0) m7fVar2.a(kceVar.b(fn0.class), null, null);
                File file = ((tf5) m7fVar2.a(kceVar.b(tf5.class), null, null)).a().e("exposures").e("global").toFile();
                ad8 ad8Var = new ad8((bg9) m7fVar2.a(kceVar.b(bg9.class), null, null), (vg5) m7fVar2.a(kceVar.b(vg5.class), mg7.a, null), fn0Var, (b4e) m7fVar2.a(kceVar.b(b4e.class), null, null), ((fk0) m7fVar2.a(kceVar.b(fk0.class), null, null)).m());
                ad8Var.r(new bg7(file, (bg9) m7fVar2.a(kceVar.b(bg9.class), null, null), (uz6) m7fVar2.a(kceVar.b(uz6.class), null, null), (h86) m7fVar2.a(kceVar.b(h86.class), null, null), ((m26) m7fVar2.a(kceVar.b(m26.class), null, null)).a(), ((AppSessionId) m7fVar2.a(kceVar.b(AppSessionId.class), null, null)).m956unboximpl(), null, false, (AppEnvironment) m7fVar2.a(kceVar.b(AppEnvironment.class), null, null), ProcessLifecycleOwner.M.J, (ConnectivityManager) yb5.g(m7fVar2).getSystemService(ConnectivityManager.class), fn0Var, new dg7(ad8Var, 0)));
                Iterator it = m7fVar2.b(kceVar.b(k4i.class)).iterator();
                while (it.hasNext()) {
                    ad8Var.r((k4i) it.next());
                }
                return new m78(ad8Var);
            case 2:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                return new cd8();
            case 3:
                m7f m7fVar3 = (m7f) obj;
                m7fVar3.getClass();
                ((bsc) obj2).getClass();
                return (rc8) m7fVar3.a(jce.a.b(cd8.class), null, null);
            case 4:
                m7f m7fVar4 = (m7f) obj;
                m7fVar4.getClass();
                ((bsc) obj2).getClass();
                Context contextG = yb5.g(m7fVar4);
                kce kceVar2 = jce.a;
                return new lgb(contextG, (i25) m7fVar4.a(kceVar2.b(i25.class), null, null), (ze0) m7fVar4.a(kceVar2.b(ze0.class), null, null), (koi) m7fVar4.a(kceVar2.b(koi.class), null, null), (h86) m7fVar4.a(kceVar2.b(h86.class), null, null));
            case 5:
                m7f m7fVar5 = (m7f) obj;
                m7fVar5.getClass();
                ((bsc) obj2).getClass();
                Context contextG2 = yb5.g(m7fVar5);
                kce kceVar3 = jce.a;
                return new sa6(contextG2, (qi3) m7fVar5.a(kceVar3.b(qi3.class), null, null), (h86) m7fVar5.a(kceVar3.b(h86.class), null, null));
            case 6:
                m7f m7fVar6 = (m7f) obj;
                m7fVar6.getClass();
                ((bsc) obj2).getClass();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) ((pl7) m7fVar6.a(jce.a.b(pl7.class), null, null)).b(FirebaseMessaging.class);
                if (firebaseMessaging != null) {
                    return firebaseMessaging;
                }
                sz6.j("FirebaseMessaging instance is null");
                return null;
            case 7:
                m7f m7fVar7 = (m7f) obj;
                m7fVar7.getClass();
                ((bsc) obj2).getClass();
                return new ul7(yb5.w(w1aVar, new hk5(m7fVar7, i3)));
            case 8:
                m7f m7fVar8 = (m7f) obj;
                m7fVar8.getClass();
                ((bsc) obj2).getClass();
                return new cm7(yb5.w(w1aVar, new hk5(m7fVar8, i2)));
            case 9:
                m7f m7fVar9 = (m7f) obj;
                m7fVar9.getClass();
                ((bsc) obj2).getClass();
                SharedPreferences sharedPreferences = ((gk0) m7fVar9.a(jce.a.b(gk0.class), null, null)).a.getSharedPreferences("app_prefs_".concat("latest_seen_completed_messages"), 0);
                sharedPreferences.getClass();
                return new om2(sharedPreferences);
            case 10:
                m7f m7fVar10 = (m7f) obj;
                m7fVar10.getClass();
                ((bsc) obj2).getClass();
                int i4 = gm7.a[((AppEnvironment) m7fVar10.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                if (i4 != 1) {
                    jm7Var = im7.a;
                    if (i4 != 2 && i4 != 3) {
                        mr9.b();
                        return null;
                    }
                } else {
                    jm7Var = hm7.a;
                }
                String strC = jm7Var.c();
                dgj.t(strC, "ApiKey must be set.");
                String strB = jm7Var.b();
                String strA = jm7Var.a();
                dgj.t(strA, "ApplicationId must be set.");
                return new fm7(strA, strC, null, null, null, null, strB);
            case 11:
                m7f m7fVar11 = (m7f) obj;
                m7fVar11.getClass();
                ((bsc) obj2).getClass();
                Context contextG3 = yb5.g(m7fVar11);
                kce kceVar4 = jce.a;
                fm7 fm7Var = (fm7) m7fVar11.a(kceVar4.b(fm7.class), null, null);
                int i5 = dm7.a[((AppEnvironment) m7fVar11.a(kceVar4.b(AppEnvironment.class), null, null)).ordinal()];
                if (i5 != 1) {
                    str = "scandium";
                    if (i5 != 2 && i5 != 3) {
                        mr9.b();
                        return null;
                    }
                } else {
                    str = "production";
                }
                return pl7.f(fm7Var, contextG3, str);
            case 12:
                return Boolean.valueOf(x44.r(obj, obj2));
            case 13:
                m7f m7fVar12 = (m7f) obj;
                m7fVar12.getClass();
                ((bsc) obj2).getClass();
                int i6 = q98.a[((AppEnvironment) m7fVar12.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                if (i6 == 1) {
                    return "1062961139910-l2m55cb9h51u5cuc9c56eb3fevouidh9.apps.googleusercontent.com";
                }
                if (i6 == 2 || i6 == 3) {
                    return "1062961139910-c6ilkqjccdhl48kenjcgif7f213hsa74.apps.googleusercontent.com";
                }
                mr9.b();
                return null;
            case 14:
                m7f m7fVar13 = (m7f) obj;
                m7fVar13.getClass();
                ((bsc) obj2).getClass();
                return new pl3((fk0) m7fVar13.a(jce.a.b(fk0.class), null, null));
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                String str2 = (String) obj;
                Throwable th = (Throwable) obj2;
                str2.getClass();
                SilentException.a(th != null ? new SilentException(str2, th) : new SilentException(str2), ozf.F, false, 2);
                return ieiVar;
            case 16:
                ((Boolean) obj2).booleanValue();
                ((pf6) obj).getClass();
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                m7f m7fVar14 = (m7f) obj;
                m7fVar14.getClass();
                ((bsc) obj2).getClass();
                return new vgc((rc8) m7fVar14.a(jce.a.b(rc8.class), null, null));
            case g.AVG_FIELD_NUMBER /* 18 */:
                Integer num = (Integer) obj2;
                ((String) obj).getClass();
                return Integer.valueOf((num != null ? num.intValue() : 0) + 1);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                m7f m7fVar15 = (m7f) obj;
                m7fVar15.getClass();
                ((bsc) obj2).getClass();
                kce kceVar5 = jce.a;
                lea leaVar = (lea) m7fVar15.a(kceVar5.b(lea.class), null, null);
                kea keaVar = (kea) m7fVar15.a(kceVar5.b(kea.class), null, null);
                a aVar = new a();
                aVar.f(kceVar5.b(_ServerLocalizedString.class), new rp4(leaVar, keaVar));
                nnf nnfVarB = aVar.b();
                a aVar2 = new a();
                ContentBlock.Companion.getClass();
                aVar2.d(bn4.b);
                ContentBlockDelta.Companion.getClass();
                aVar2.d(cn4.b);
                DisabledReason.Companion.getClass();
                aVar2.d(com.anthropic.claude.api.model.a.b);
                ExperienceClientAction.Companion.getClass();
                aVar2.d(k97.b);
                ExperienceContent.Companion.getClass();
                aVar2.d(n97.b);
                ExperienceTrackActionData.Companion.getClass();
                aVar2.d(ya7.b);
                MessageFile.Companion.getClass();
                aVar2.d(kgb.b);
                STTApiMessage.Companion.getClass();
                aVar2.d(STTApiMessage.serializersModule);
                SourceMetadata.Companion.getClass();
                aVar2.d(zeg.b);
                nnfVarB.a(aVar2);
                StreamEvent.Companion.getClass();
                aVar2.d(ypg.b);
                TaskSessionEvent.Companion.getClass();
                aVar2.d(r7h.b);
                ThinkingState.Companion.getClass();
                aVar2.d(com.anthropic.claude.api.model.g.b);
                ToolDisplayContent.Companion.getClass();
                aVar2.d(qwh.b);
                ToolResultContent.Companion.getClass();
                aVar2.d(qyh.b);
                return u00.c(new a2(18, aVar2.b()));
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                x0a x0aVar = (x0a) obj2;
                return x44.X(Integer.valueOf(((isc) x0aVar.e.b).h()), Integer.valueOf(((isc) x0aVar.e.c).h()));
            case 21:
                Map mapE = ((f1a) obj2).e();
                if (mapE.isEmpty()) {
                    return null;
                }
                return mapE;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                m7f m7fVar16 = (m7f) obj;
                m7fVar16.getClass();
                ((bsc) obj2).getClass();
                return new q2a(yb5.g(m7fVar16), ((koi) m7fVar16.a(jce.a.b(koi.class), null, null)).d);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                m7f m7fVar17 = (m7f) obj;
                m7fVar17.getClass();
                ((bsc) obj2).getClass();
                return new h9(yb5.g(m7fVar17), (h86) m7fVar17.a(jce.a.b(h86.class), null, null));
            case 24:
                m7f m7fVar18 = (m7f) obj;
                m7fVar18.getClass();
                ((bsc) obj2).getClass();
                kce kceVar6 = jce.a;
                koi koiVar = (koi) m7fVar18.a(kceVar6.b(koi.class), null, null);
                return new is5(koiVar, (tja) m7fVar18.a(kceVar6.b(tja.class), null, null), (eo3) m7fVar18.a(kceVar6.b(eo3.class), null, null), (Context) m7fVar18.a(kceVar6.b(Context.class), null, null), (qi3) m7fVar18.a(kceVar6.b(qi3.class), null, null), koiVar.d, (h9) m7fVar18.a(kceVar6.b(h9.class), null, null));
            case BuildConfig.VERSION_CODE /* 25 */:
                m7f m7fVar19 = (m7f) obj;
                m7fVar19.getClass();
                ((bsc) obj2).getClass();
                er9 er9Var = m7fVar19.e;
                new rpa(i);
                dm dmVar = new dm(0, e8.a, e8.class, "modules", "modules()Ljava/util/List;", 0, 16);
                dm dmVar2 = new dm(0, boi.a, boi.class, "modules", "modules()Ljava/util/List;", 0, 17);
                a73 a73Var = new a73(12);
                fj0 fj0Var = new fj0();
                fj0Var.E = dmVar;
                fj0Var.F = dmVar2;
                fj0Var.G = a73Var;
                return new ql3(er9Var, fj0Var);
            case 26:
                m7f m7fVar20 = (m7f) obj;
                m7fVar20.getClass();
                ((bsc) obj2).getClass();
                mrg mrgVar = nai.x;
                kce kceVar7 = jce.a;
                return new ezd((prb) m7fVar20.a(kceVar7.b(prb.class), mrgVar, null), (mga) m7fVar20.a(kceVar7.b(mga.class), null, null));
            case 27:
                m7f m7fVar21 = (m7f) obj;
                m7fVar21.getClass();
                ((bsc) obj2).getClass();
                cd8 cd8Var = (cd8) m7fVar21.c(jce.a.b(cd8.class));
                if (cd8Var == null) {
                    cd8Var = new cd8();
                }
                return new xta(cd8Var);
            case 28:
                m7f m7fVar22 = (m7f) obj;
                m7fVar22.getClass();
                ((bsc) obj2).getClass();
                return new lt9((xta) m7fVar22.a(jce.a.b(xta.class), null, null));
            default:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                return new z74(new aua(true));
        }
    }
}
