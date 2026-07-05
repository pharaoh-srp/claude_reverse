package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import okio.AsyncTimeout;

/* JADX INFO: loaded from: classes.dex */
public final class ydg extends AsyncTimeout {
    public final Socket o;

    public ydg(Socket socket) {
        this.o = socket;
    }

    @Override // okio.AsyncTimeout
    public final IOException m(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // okio.AsyncTimeout
    public final void n() {
        Socket socket = this.o;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!ukj.b(e)) {
                throw e;
            }
            ukj.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            ukj.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
