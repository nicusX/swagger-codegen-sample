package it.nicus.swaggergensample.api;

import it.nicus.swaggergensample.model.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.Map;

@Controller
public class StoreApiController implements StoreApi {
    @Override
    public ResponseEntity<Void> deleteOrder(Long orderId, String accept) {
        return null;
    }

    @Override
    public ResponseEntity<Map<String, Integer>> getInventory(String accept) throws IOException {
        return null;
    }

    @Override
    public ResponseEntity<Order> getOrderById(Long orderId, String accept) throws IOException {
        return null;
    }

    @Override
    public ResponseEntity<Order> placeOrder(Order body, String accept) throws IOException {
        return null;
    }
}
