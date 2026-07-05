package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class fdj {
    public static vvi a(qh9 qh9Var) {
        try {
            Number numberL = qh9Var.s("session_sample_rate").l();
            bh9 bh9VarS = qh9Var.s("session_replay_sample_rate");
            Number numberL2 = bh9VarS != null ? bh9VarS.l() : null;
            bh9 bh9VarS2 = qh9Var.s("profiling_sample_rate");
            Number numberL3 = bh9VarS2 != null ? bh9VarS2.l() : null;
            bh9 bh9VarS3 = qh9Var.s("trace_sample_rate");
            Number numberL4 = bh9VarS3 != null ? bh9VarS3.l() : null;
            bh9 bh9VarS4 = qh9Var.s("start_session_replay_recording_manually");
            Boolean boolValueOf = bh9VarS4 != null ? Boolean.valueOf(bh9VarS4.a()) : null;
            numberL.getClass();
            return new vvi(numberL, numberL2, numberL3, numberL4, boolValueOf);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Configuration", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Configuration", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Configuration", e3);
            return null;
        }
    }

    public abstract boolean b();

    public abstract void c(boolean z);

    public abstract void d(boolean z);
}
