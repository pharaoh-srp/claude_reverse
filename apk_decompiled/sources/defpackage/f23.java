package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import com.anthropic.claude.R;
import com.anthropic.claude.api.common.ConsistencyLevel;
import com.anthropic.claude.chat.ChatScreenParams;
import com.anthropic.claude.configs.AccountSwitcherConfig;
import com.anthropic.claude.types.strings.OrganizationId;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f23 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f23(t53 t53Var, ChatScreenParams chatScreenParams, hw2 hw2Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 1;
        this.F = t53Var;
        this.G = chatScreenParams;
        this.H = hw2Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.H;
        Object obj3 = this.F;
        switch (i) {
            case 0:
                return new f23((wxc) this.G, (t53) obj3, (nwb) obj2, tp4Var, 0);
            case 1:
                return new f23((t53) obj3, (ChatScreenParams) this.G, (hw2) obj2, tp4Var);
            case 2:
                f23 f23Var = new f23((yn8) obj3, (ConsistencyLevel) obj2, tp4Var, 2);
                f23Var.G = obj;
                return f23Var;
            case 3:
                return new f23((Context) this.G, (i8c) obj3, (wv4) obj2, tp4Var, 3);
            case 4:
                f23 f23Var2 = new f23((bz7) obj3, (zy7) obj2, tp4Var, 4);
                f23Var2.G = ((OrganizationId) obj).m1071unboximpl();
                return f23Var2;
            case 5:
                return new f23((f8) this.G, (koi) obj3, (q7) obj2, tp4Var, 5);
            case 6:
                return new f23((rc8) this.G, (fk0) obj3, (koi) obj2, tp4Var, 6);
            default:
                tp4Var.getClass();
                return new f23((dae) this.G, (m9) obj3, (epg) obj2, tp4Var, 7);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((f23) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 1:
                ((f23) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 2:
                ((f23) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 3:
                ((f23) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 4:
                ((f23) create(OrganizationId.m1065boximpl(((OrganizationId) obj).m1071unboximpl()), (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 5:
                ((f23) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 6:
                ((f23) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            default:
                ((f23) create(obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i;
        NotificationChannel notificationChannel;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        NotificationChannel notificationChannel4;
        int i2 = this.E;
        int i3 = 2;
        int i4 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        iei ieiVar = iei.a;
        Object obj2 = this.H;
        Object obj3 = this.F;
        switch (i2) {
            case 0:
                sf5.h0(obj);
                nwb nwbVar = (nwb) obj2;
                xe4 xe4Var = z23.a;
                if (((zy7) nwbVar.getValue()) != null && x44.r(((wxc) this.G).e(), yxc.a)) {
                    ((t53) obj3).r0();
                    zy7 zy7Var = (zy7) nwbVar.getValue();
                    if (zy7Var != null) {
                        zy7Var.a();
                    }
                    nwbVar.setValue(null);
                }
                break;
            case 1:
                ChatScreenParams chatScreenParams = (ChatScreenParams) this.G;
                sf5.h0(obj);
                if (((Boolean) ((t53) obj3).P0.getValue()).booleanValue() && chatScreenParams.getInitialPrompt() != null) {
                    hw2 hw2Var = (hw2) obj2;
                    String initialPrompt = chatScreenParams.getInitialPrompt();
                    initialPrompt.getClass();
                    cpk.u(hw2Var.D, initialPrompt);
                    hw2Var.f.a.h();
                    lsc lscVar = hw2Var.K;
                    Boolean bool = Boolean.FALSE;
                    lscVar.setValue(bool);
                    hw2Var.H.setValue(null);
                    hw2Var.F.setValue(null);
                    hw2Var.G.setValue(null);
                    hw2Var.z.setValue(bool);
                }
                break;
            case 2:
                l45 l45Var = (l45) this.G;
                sf5.h0(obj);
                yn8 yn8Var = (yn8) obj3;
                if (((List) yn8Var.d.l.getValue()).isEmpty()) {
                    wn8 wn8Var = new wn8(yn8Var, objArr4 == true ? 1 : 0, i4);
                    i = 3;
                    gb9.D(l45Var, null, null, wn8Var, 3);
                } else {
                    i = 3;
                }
                gb9.D(l45Var, null, null, new dx((Object) yn8Var, obj2, (tp4) (objArr3 == true ? 1 : 0), 29), i);
                if (!yn8Var.N()) {
                    yn8Var.m.setValue(Boolean.TRUE);
                } else {
                    gb9.D(l45Var, null, null, new wn8(yn8Var, objArr2 == true ? 1 : 0, i3), i);
                    gb9.D(l45Var, null, null, new wn8(yn8Var, objArr == true ? 1 : 0, i), i);
                }
                break;
            case 3:
                sf5.h0(obj);
                List list = d7c.a;
                Context context = (Context) this.G;
                i8c i8cVar = (i8c) obj3;
                boolean zBooleanValue = ((Boolean) i8cVar.a.getValue()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) i8cVar.b.getValue()).booleanValue();
                boolean zBooleanValue3 = ((Boolean) i8cVar.d.getValue()).booleanValue();
                boolean zBooleanValue4 = ((Boolean) i8cVar.e.getValue()).booleanValue();
                boolean zBooleanValue5 = ((Boolean) ((wv4) obj2).a.getValue()).booleanValue();
                context.getClass();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (notificationManager != null) {
                    NotificationChannel notificationChannel5 = new NotificationChannel("voice_mode_notification_channel_v2", context.getString(R.string.notification_channel_voice_mode_name), 4);
                    notificationChannel5.setShowBadge(false);
                    notificationChannel5.setSound(null, null);
                    notificationChannel5.enableVibration(false);
                    NotificationChannel notificationChannel6 = new NotificationChannel("tts_playback_notification_channel", context.getString(R.string.notification_channel_tts_playback_name), 2);
                    notificationChannel6.setShowBadge(false);
                    NotificationChannel notificationChannel7 = new NotificationChannel("compass", context.getString(R.string.notification_channel_research_name), 4);
                    notificationChannel7.setDescription(context.getString(R.string.notification_channel_research_description));
                    notificationChannel7.setShowBadge(true);
                    NotificationChannel notificationChannel8 = new NotificationChannel("assist", context.getString(R.string.notification_channel_assist_name), 4);
                    notificationChannel8.setDescription(context.getString(R.string.notification_channel_assist_description));
                    notificationChannel8.setShowBadge(true);
                    NotificationChannel notificationChannelA = zBooleanValue5 ? d7c.a(context) : null;
                    if (zBooleanValue2) {
                        NotificationChannel notificationChannel9 = new NotificationChannel("bogosort", context.getString(R.string.notification_channel_code_name), 4);
                        notificationChannel9.setDescription(context.getString(R.string.notification_channel_code_description));
                        notificationChannel9.setShowBadge(true);
                        notificationChannel = notificationChannel9;
                    } else {
                        notificationChannel = null;
                    }
                    if (zBooleanValue3) {
                        NotificationChannel notificationChannel10 = new NotificationChannel("dispatch", context.getString(R.string.notification_channel_dispatch_name), 4);
                        notificationChannel10.setDescription(context.getString(R.string.notification_channel_dispatch_description));
                        notificationChannel10.setShowBadge(true);
                        notificationChannel2 = notificationChannel10;
                    } else {
                        notificationChannel2 = null;
                    }
                    if (zBooleanValue) {
                        NotificationChannel notificationChannel11 = new NotificationChannel("completion", context.getString(R.string.notification_channel_completion_name), 4);
                        notificationChannel11.setDescription(context.getString(R.string.notification_channel_completion_description));
                        notificationChannel11.setShowBadge(true);
                        notificationChannel3 = notificationChannel11;
                    } else {
                        notificationChannel3 = null;
                    }
                    if (zBooleanValue4) {
                        NotificationChannel notificationChannel12 = new NotificationChannel("marketing", context.getString(R.string.notification_channel_marketing_name), 3);
                        notificationChannel12.setDescription(context.getString(R.string.notification_channel_marketing_description));
                        notificationChannel12.setShowBadge(true);
                        notificationChannel4 = notificationChannel12;
                    } else {
                        notificationChannel4 = null;
                    }
                    notificationManager.createNotificationChannels(mp0.C0(new NotificationChannel[]{notificationChannel5, notificationChannel6, notificationChannel7, notificationChannel8, notificationChannelA, notificationChannel, notificationChannel2, notificationChannel3, notificationChannel4}));
                    Iterator it = d7c.a.iterator();
                    while (it.hasNext()) {
                        notificationManager.deleteNotificationChannel((String) it.next());
                    }
                }
                break;
            case 4:
                String str = (String) this.G;
                sf5.h0(obj);
                List list2 = xah.a;
                xah.e(6, "Handling org change", null, null);
                ((bz7) obj3).invoke(OrganizationId.m1065boximpl(str));
                ((zy7) obj2).a();
                break;
            case 5:
                sf5.h0(obj);
                f8 f8Var = (f8) this.G;
                String str2 = ((koi) obj3).e;
                SharedPreferences.Editor editorEdit = f8Var.a.edit();
                editorEdit.putString("selected_org_id", str2 == null ? null : str2);
                editorEdit.apply();
                f8Var.b.setValue(str2 != null ? OrganizationId.m1065boximpl(str2) : null);
                String strM105getEmail_addressZiuLfiY = ((q7) obj2).a().m105getEmail_addressZiuLfiY();
                kgh.t(f8Var.a, "display_email", strM105getEmail_addressZiuLfiY);
                f8Var.c.setValue(strM105getEmail_addressZiuLfiY);
                break;
            case 6:
                sf5.h0(obj);
                ((fk0) obj3).a(((koi) obj2).d, ((rc8) this.G).o(AccountSwitcherConfig.FLAG_ACCOUNT_SWITCHER));
                break;
            default:
                sf5.h0(obj);
                dae daeVar = (dae) this.G;
                vlg vlgVarA = ((m9) obj3).a((vlg) daeVar.E);
                daeVar.E = vlgVarA;
                epg epgVar = (epg) obj2;
                epgVar.getClass();
                epgVar.a = vlgVarA;
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f23(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = obj;
        this.H = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f23(Object obj, Object obj2, Object obj3, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.F = obj2;
        this.H = obj3;
    }
}
