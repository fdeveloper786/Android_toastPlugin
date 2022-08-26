import android.content.Context;
import android.widget.Toast;

public class ToastMessageClass {
    public static void msg(Context ctx, String message) {
        Toast.makeText(ctx,message, Toast.LENGTH_SHORT).show();
    }
}
