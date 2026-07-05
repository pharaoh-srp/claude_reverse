package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$AudioRouteChanged;
import com.anthropic.claude.analytics.events.VoiceEvents$FocusChanged;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceEntrySource;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceFocusResult;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceInputTrigger;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class g5j {
    public long A;
    public Boolean B;
    public Long C;
    public boolean D;
    public final qi3 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final zy7 f;
    public final VoiceEvents$VoiceEntrySource g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public int o;
    public boolean p;
    public final long q;
    public Long r;
    public Long s;
    public Long t;
    public Long u;
    public VoiceEvents$VoiceInputTrigger v;
    public Integer w;
    public boolean x;
    public boolean y;
    public Long z;

    public g5j(qi3 qi3Var, String str, String str2, String str3, o1j o1jVar) {
        VoiceEvents$VoiceEntrySource voiceEvents$VoiceEntrySource;
        e5j e5jVar = e5j.E;
        str.getClass();
        str2.getClass();
        str3.getClass();
        o1jVar.getClass();
        this.a = qi3Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = "coordinator";
        this.f = e5jVar;
        int iOrdinal = o1jVar.ordinal();
        if (iOrdinal == 0) {
            voiceEvents$VoiceEntrySource = VoiceEvents$VoiceEntrySource.CHAT_BUTTON;
        } else if (iOrdinal == 1) {
            voiceEvents$VoiceEntrySource = VoiceEvents$VoiceEntrySource.WIDGET;
        } else if (iOrdinal == 2) {
            voiceEvents$VoiceEntrySource = VoiceEvents$VoiceEntrySource.APP_INTENT;
        } else {
            if (iOrdinal != 3) {
                wg6.i();
                throw null;
            }
            voiceEvents$VoiceEntrySource = VoiceEvents$VoiceEntrySource.RETRY;
        }
        this.g = voiceEvents$VoiceEntrySource;
        this.q = ((Number) e5jVar.a()).longValue();
    }

    public final synchronized void a(VoiceEvents$VoiceInputTrigger voiceEvents$VoiceInputTrigger) {
        voiceEvents$VoiceInputTrigger.getClass();
        if (this.s != null) {
            return;
        }
        this.s = (Long) this.f.a();
        this.v = voiceEvents$VoiceInputTrigger;
    }

    public final synchronized void b() {
        if (this.r != null) {
            return;
        }
        this.r = (Long) this.f.a();
        this.s = null;
        this.v = null;
    }

    public final void c() {
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = false;
        this.y = false;
    }

    public final synchronized void d(s51 s51Var, String str) {
        String str2;
        try {
            s51Var.getClass();
            if (this.r != null) {
                this.x = true;
            }
            qi3 qi3Var = this.a;
            String str3 = this.b;
            String str4 = this.c;
            String str5 = this.d;
            if (s51Var.equals(r51.a)) {
                str2 = "speaker";
            } else {
                if (!(s51Var instanceof q51)) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "bt_sco";
            }
            qi3Var.e(new VoiceEvents$AudioRouteChanged(str3, str4, str5, str2, str), VoiceEvents$AudioRouteChanged.Companion.serializer());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e(VoiceEvents$VoiceFocusResult voiceEvents$VoiceFocusResult, List list, List list2) {
        try {
            voiceEvents$VoiceFocusResult.getClass();
            list.getClass();
            list2.getClass();
            Boolean bool = this.B;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            switch (f5j.a[voiceEvents$VoiceFocusResult.ordinal()]) {
                case 1:
                    this.B = Boolean.TRUE;
                    break;
                case 2:
                    this.B = Boolean.FALSE;
                    break;
                case 3:
                    this.B = Boolean.TRUE;
                    Long l = this.C;
                    if (l != null) {
                        this.n = (((Number) this.f.a()).longValue() - l.longValue()) + this.n;
                    }
                    this.C = null;
                    break;
                case 4:
                    this.B = Boolean.FALSE;
                    this.m++;
                    if (this.r != null) {
                        this.y = true;
                    }
                    Long l2 = this.C;
                    if (l2 != null) {
                        this.n = (((Number) this.f.a()).longValue() - l2.longValue()) + this.n;
                    }
                    this.C = null;
                    break;
                case 5:
                case 6:
                    this.B = Boolean.FALSE;
                    this.m++;
                    if (this.r != null) {
                        this.y = true;
                    }
                    if (this.C == null) {
                        this.C = (Long) this.f.a();
                    }
                    break;
                case 7:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            this.a.e(new VoiceEvents$FocusChanged(this.b, this.c, this.d, voiceEvents$VoiceFocusResult, ((Number) this.f.a()).longValue() - this.q, this.h, zBooleanValue, list, list2), VoiceEvents$FocusChanged.Companion.serializer());
        } catch (Throwable th) {
            throw th;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v2 com.anthropic.claude.analytics.events.VoiceEvents$TurnCompleted, still in use, count: 2, list:
          (r2v2 com.anthropic.claude.analytics.events.VoiceEvents$TurnCompleted) from 0x009b: MOVE (r16v0 com.anthropic.claude.analytics.events.VoiceEvents$TurnCompleted) = (r2v2 com.anthropic.claude.analytics.events.VoiceEvents$TurnCompleted)
          (r2v2 com.anthropic.claude.analytics.events.VoiceEvents$TurnCompleted) from 0x005e: MOVE (r16v5 com.anthropic.claude.analytics.events.VoiceEvents$TurnCompleted) = (r2v2 com.anthropic.claude.analytics.events.VoiceEvents$TurnCompleted)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final synchronized void f(com.anthropic.claude.analytics.events.VoiceEvents$VoiceActivationMode r27, com.anthropic.claude.analytics.events.VoiceEvents$VoiceTurnOutcome r28, defpackage.w0j r29, java.lang.Integer r30) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g5j.f(com.anthropic.claude.analytics.events.VoiceEvents$VoiceActivationMode, com.anthropic.claude.analytics.events.VoiceEvents$VoiceTurnOutcome, w0j, java.lang.Integer):void");
    }
}
